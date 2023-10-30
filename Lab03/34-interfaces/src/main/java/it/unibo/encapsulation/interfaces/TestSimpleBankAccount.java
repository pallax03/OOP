package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder customer1 = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder customer2 = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        BankAccount bank_customer1 = new SimpleBankAccount(1, 0);
        BankAccount bank_customer2 = new SimpleBankAccount(2, 0);

        // 4) Effettuare una serie di depositi e prelievi
        bank_customer1.deposit(1, 10000);
        bank_customer2.deposit(2, 5000);

        bank_customer1.withdraw(1, 2000);
        bank_customer2.withdraw(2, 1000);
        
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(bank_customer1.toString());
        System.out.println(bank_customer2.toString());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        bank_customer1.withdraw(2,10000);


        // 7) Controllare nuovamente l'ammontare
        System.out.println(bank_customer1.toString());
    }
}
