package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013

        Student studente1 = new Student(1014, "Rossi", "Mario", 2013);
        studente1.printStudentInfo();

        // // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // // immatricolazione 2010

        Student studente2 = new Student(1018, "Bianchi", "Luca", 2010);
        studente2.printStudentInfo();

        // // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // // immatricolazione 2012

        Student studente3 = new Student(1019, "Vitiello", "Peppino", 2012);
        studente3.printStudentInfo();

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013

        Student studente4 = new Student(1020, "Verdi", "Luca", 2013);
        studente4.printStudentInfo();

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe

        Train train_short = new Train(100, 200);
        train_short.printTrainInfo();

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe

        Train train_long = new Train(1200, 50, 1050);
        train_long.printTrainInfo();

        // 7) Creare un treno con 500 posti, tutti di seconda classe

        Train train_medium = new Train(0, 300);
        train_medium.printTrainInfo();

        // 8) Creare un treno con numero di posti di default

        Train train_default = new Train();
        train_default.printTrainInfo();

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        if(train_default.seats > 0)
            System.out.println("posti totali positivi" + train_default.seats);
        else
            System.out.println("posti totali positivi" + train_default.seats);
        System.out.println("(prima classe) " + train_default.firstClassSeats + " + (seconda classe) " + train_default.secondClassSeats + " = " + train_default.seats);
    }
}
