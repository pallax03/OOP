class TestStudent {

    public static void main(String[] args) {
        Student studente1 = new Student();
        studente1.build("Alex", "Balducci", 1015, 2019);
        studente1.printStudentInfo();

        Student studente2 = new Student();
        studente2.build("Angel", "Bianchi", 1016, 2018);
        studente2.printStudentInfo();
        
        Student studente3 = new Student();
        studente3.build("Andrea", "Bracci", 1017, 2017);
        studente3.printStudentInfo();
    }
}
