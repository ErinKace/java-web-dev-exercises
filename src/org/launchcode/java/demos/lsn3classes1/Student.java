package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId) {
        this.name = aName;
        this.studentId = aStudentId;
    }
    public String getName() {
        return this.name;
    }
    public int getStudentId() {
        return this.studentId;
    }
    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public double getGpa() {
        return this.gpa;
    }
    private void setName(String newName) {
        this.name = newName;
    }
    public void setStudentId(int newStudentId) {
        this.studentId = newStudentId;
    }
    public void setNumberOfCredits(int newCredits) {
        this.numberOfCredits = newCredits;
    }
    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

}