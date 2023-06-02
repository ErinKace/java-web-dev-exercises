package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String afirstName, String aLastName, String aSubject, int aYearsTeaching) {
        this.firstName = afirstName;
        this.lastName = aLastName;
        this.subject = aSubject;
        this.yearsTeaching = aYearsTeaching;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }
    public void setYearsTeaching(int newYears) {
        this.yearsTeaching = newYears;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getSubject() {
        return this.subject;
    }
    public int getYearsTeaching() {
        return this.yearsTeaching;
    }
}
