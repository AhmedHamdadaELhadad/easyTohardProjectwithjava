package StudentDataBaseApp;

import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args) {

        //   ASK for new user add
        System.out.print("Enter Number of Student  to Enroll : ");
        Scanner in = new Scanner(System.in);
        int numberofStudent = in.nextInt();
        Student[] students = new Student[numberofStudent];
        
        
        // Asgin vaule of all student 
        for (int i = 0; i < numberofStudent; ++i) {
            students[i] = new Student();
            students[i].Enorll();
            students[i].Pay_tution();
        }
        
        //SHOW INFORMATION OF ALL STUDENT 
        for (int i = 0; i < numberofStudent; ++i) {

            System.out.println(students[i].toString());
        }
    }
}
