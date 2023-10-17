package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student student1 = new Student(0, "Alex", "Rossi", "pino1234", 2018);
        Student student2 = new Student(1, "Alberto", "Bianchi", "pino4321", 2020);
        Student student3 = new Student(2, "Giovanna", "Blu", "pino2143", 2023);

        // 2)Creare 2 docenti a piacere
        Professor professor1 = new Professor(0, "Luciano", "Albertini", "mcdonald11", new String[] {"matematica", "algoritmi"});
        Professor professor2 = new Professor(1, "Alberto", "Angela", "ginomastrota", new String[] {"italiano", "storia", "geografia"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom exam_room1 = new ExamRoom(100, "", false, true);
        ExamRoom exam_room2 = new ExamRoom(80, "", true, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        Exam exam1 = new Exam(0, 10, "matematica", professor1, exam_room1);
        Exam exam2 = new Exam(1, 2, "italiano", professor2, exam_room2);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registerStudent(student1);
        exam1.registerStudent(student2);
        exam1.registerStudent(student3);
        
        exam2.registerStudent(student1);
        exam2.registerStudent(student2);
        exam2.registerStudent(student3);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1);
        System.out.println(exam2);
    }
}
