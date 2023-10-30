package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {
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

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */
    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions=0;
    }

    /*
     * Si aggiungano selettori per:
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
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
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()+amount);
        } 
    }

    public void withdraw(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()-amount);
        }
    }

    public void depositFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()+amount-ATM_TRANSACTION_FEE);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
        if(id == getId()) {
            setTransactions(getTransactionsCount()+1);
            setBalance(getBalance()-amount-ATM_TRANSACTION_FEE);
        }
    }

    public void chargeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
        if(id == getId())   setBalance(getBalance()-ATM_TRANSACTION_FEE);
    }
    public String toString() {
        return (getId()+ ", balance: " +getBalance());
    }
}
