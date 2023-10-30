package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(final int id, final double balance) {
        super(id, balance);
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }
    
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + super.getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            super.setBalance(super.getBalance()-feeAmount);
            super.resetTransactions();
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }
}
