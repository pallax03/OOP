package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount{
    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    public void withdraw(int id, double amount) {
        if(isWithDrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }

    public void chargeManagementFees(int id) {
        final double feeAmount = SimpleBankAccount.MANAGEMENT_FEE + super.getTransactionsCount() * TRANSACTION_FEE;
        if (super.checkUser(id) && this.isWithDrawAllowed(feeAmount)) {
            super.withdraw(id, feeAmount);
            super.resetTransactions();
        }
    }

    public void depositFromATM(int id, double amount) {
        super.deposit(id, amount - SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(int id, double amount) {
        super.withdraw(id, amount+SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    protected boolean isWithDrawAllowed(double amount) {
        return super.getBalance() >= amount;
    }

    protected double computeFee() {
        return SimpleBankAccount.MANAGEMENT_FEE;
    }
    
}
