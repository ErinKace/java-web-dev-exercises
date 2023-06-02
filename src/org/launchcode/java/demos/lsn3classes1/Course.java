package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    String courseName;
    String teacherName;
    int courseCredits;
    ArrayList<Student> studentList = new ArrayList<>();
    HashMap<String, Double> courseGrades = new HashMap<>();
}
