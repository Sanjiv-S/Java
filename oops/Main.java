import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Helper.printInstructions();

        // AttendanceEmployee[] employees = new AttendanceEmployee[3];

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("\nEnter details for Employee " + (i + 1) + ":");

        //     System.out.print("Enter Name: ");
        //     String name = sc.next();

        //     System.out.print("Enter ID: ");
        //     int id = sc.nextInt();

        //     System.out.print("Enter Department: ");
        //     String dept = sc.next();

        //     AttendanceEmployee emp = new AttendanceEmployee(name, id, dept);

        //     System.out.print("Enter Attendance (7 values of 0/1): ");
        //     int[] attendance = new int[7];
        //     for (int j = 0; j < 7; j++) {
        //         attendance[j] = sc.nextInt();
        //     }

        //     emp.markAttendance(attendance);
        //     emp.showDetails();
        //     emp.displayAttendance();

        //     employees[i] = emp;
        // }

        // Employee.showEmployeeCount();
        // sc.close();
        Department d1=new Department("AIML",115);
        Department[] dept={d1};
        Student s1=new Student("Sanjiv",49, dept);
        s1.showStudentDetails();


    }
}

