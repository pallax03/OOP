package it.unibo.composition;

import java.util.Arrays;

/**
 * Exam
 */
public class Exam {
    int id;
    public int getId() {
        return id;
    }

    int maxStudents;
    public int getMaxStudents() {
        return maxStudents;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    int registeredStudents;
    public int getRegisteredStudents() {
        return registeredStudents;
    }
    public void setRegisteredStudents(int registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    String courseName;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    Professor professor;
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    ExamRoom room;      // (fornita nei sorgenti)
    public ExamRoom getRoom() {
        return room;
    }
    public void setRoom(ExamRoom room) {
        this.room = room;
    }

    Student[] students;
    public Student[] getStudents() {
        return students;
    }
    public void setStudent(Student student, int index) {
        this.students[index] = student;
    }


    Exam(int id, int maxStudents, String courseName, Professor professor, ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public void registerStudent(Student student) {
        if(getRegisteredStudents()+1 <= getMaxStudents()) {
            setStudent(student, getRegisteredStudents());
            setRegisteredStudents(getRegisteredStudents()+1);
        }
    }
    public String toString() {
        return  getId()+", corso: "+getCourseName()+"\n"+
                getRegisteredStudents()+"/"+getMaxStudents()+", professore: " + getProfessor()+"\n"+
                "Exam room: "+getRoom()+"\n"+
                "students: " + Arrays.toString(getStudents());
    }
}