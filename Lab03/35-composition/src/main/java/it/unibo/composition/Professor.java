package it.unibo.composition;

/**
 * Professor
 */
public class Professor implements User {
    private int id;
    private String name;
    public String getName() {
        return name;
    }

    private String surname;
    public String getSurname() {
        return surname;
    }

    private String password; // (nota, in realtà le password non dovrebbero mai esser tenute in chiaro)
    private String[] courses;


    Professor(int id, String name, String surname, String password, String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }


    public String getUsername() {
        return getName() + "." + getSurname();
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return "";
    }
    public void replaceCourse(String new_course, int index) {
        this.courses[index] = new_course;
    }
    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return getUsername();
    }

}