package org.example;

public class Student extends Human{
    private String faculty;
    public Student(String lastname, String name, String otchestvo, int age) {
        super(lastname, name, otchestvo, age);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
