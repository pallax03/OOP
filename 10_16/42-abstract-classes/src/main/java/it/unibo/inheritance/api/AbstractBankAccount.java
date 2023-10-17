package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount { 
    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        this.transactions = 0;
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        setTransactionsCount(0);
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    public void withdraw(int id, double amount) {
        this.transactionOp(id, -amount);
    }

    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }
    public double setBalance(double balance) {
        return this.balance = balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }
    public int setTransactionsCount(int transactions) {
        return this.transactions = transactions;
    }
    
    protected abstract boolean isWithDrawAllowed(double amount);    //return true if is it possible to withdraw
    protected abstract double computeFee();     //returns the current amount of managemen fees
}
