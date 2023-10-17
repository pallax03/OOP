package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount{

    public ClassicBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }
    
    public void chargeManagementFees(int id)
    {
        if (checkUser(id)) {
            super.withdraw(id, SimpleBankAccount.MANAGEMENT_FEE);
            super.resetTransactions();
        }
    }

    public void depositFromATM(int id, double amount) {
        super.deposit(id, amount - SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(int id, double amount) {
        super.withdraw(id, amount + SimpleBankAccount.ATM_TRANSACTION_FEE);
    }

    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() >= amount;
    }

    protected double computeFee() {
        return SimpleBankAccount.MANAGEMENT_FEE;
    }
}
