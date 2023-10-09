package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int transactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     * - static double MANAGEMENT_FEE = 5: costo della gestione conto
     */

    private double balance;     //ammontare del conto
    private int transactions;   //numero delle operazioni effettuate
    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;

    private final int id;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions=0;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }
    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public void deposit(final int id, final double amount) {
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()+amount);
        } 
    }

    public void withdraw(final int id, final double amount) {
        if(id == getId() && (getBalance() - amount) >= 0) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()-amount);
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()+amount-ATM_TRANSACTION_FEE);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        if(id == getId() && (getBalance() - amount - ATM_TRANSACTION_FEE) >= 0) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()-amount-ATM_TRANSACTION_FEE);
        }
    }

    public void chargeManagementFees(final int id) {
        if(id == getId())   setBalance(getBalance() - (MANAGEMENT_FEE*getTransactionsCount()));
    }
    public String toString() {
        return (getId()+ ", balance: " +getBalance());
    }
}
