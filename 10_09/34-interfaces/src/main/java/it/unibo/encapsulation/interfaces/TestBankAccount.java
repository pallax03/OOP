package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder customer1 = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder customer2 = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount bank_customer1 = new SimpleBankAccount(1, 0); //rossi
        BankAccount bank_customer2 = new StrictBankAccount(2, 0); //Bianchi
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         * le due classi appartengono all-interfaccia bankaccount
         */

        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        bank_customer1.deposit(1, 10000);
        bank_customer2.deposit(2, 10000);
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        bank_customer1.withdraw(1, 15000);
        bank_customer2.withdraw(2, 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println(bank_customer1);
        System.out.println(bank_customer2);
        /*
         * 8) Qual è il risultato e perché?
         * il primo conto dovrebbe avere il conto in negativo (-5000)
         * l'altro conto non ha effettuato il prelievo
         */ 
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        bank_customer1.deposit(1, 10000);
        bank_customer2.deposit(2, 10000);
        /*
         * 10) Invocare il metodo chargeManagementFees su entrambi i conti
         */
        bank_customer1.chargeManagementFees(1);
        bank_customer2.chargeManagementFees(2);
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println(bank_customer1.toString());
        System.out.println(bank_customer2.toString());
        /*
         * 12) Qual è il risultato e perché?
         * nel primo conto le spese sono costanti (5 euro)
         * nel secondo conto le spese variano anche dal numero di transazioni effettuate
         */
    }
}
