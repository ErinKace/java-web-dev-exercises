package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIDs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newID = input.nextInt();
                studentIDs.put(newID, newStudent);
            }

            input.nextLine();
        } while (!newStudent.equals(""));
        input.close();

        System.out.println("\nStudent List: ");
        for (Map.Entry<Integer, String> student : studentIDs.entrySet()) {
            System.out.println(student.getKey()+": "+student.getValue());
        }
    }

}
