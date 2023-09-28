class TestStudent {

    public static void main(String[] args) {
        Student studente1 = new Student();
        Student studente2 = new Student();
        Student studente3 = new Student();

        studente1.build("Alex", "Balducci", 1015, 2019);
        studente2.build("Angel", "Bianchi", 1016, 2018);
        studente3.build("Andrea", "Bracci", 1017, 2017);
        
        studente1.printStudentInfo();
        studente2.printStudentInfo();
        studente3.printStudentInfo();
    }
}
