package com.pm.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {

    public void Calculate() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter the number of courses this semester: ");
        int numCourses = scanner.nextInt();

        double totalMarks = 0;

        for (int course = 1; course <= numCourses; course++) {
            System.out.printf("Enter mark for course %d: ", course);
            double mark = scanner.nextDouble();
            totalMarks += mark;
        }

        double average = totalMarks / numCourses;
        char grade;

        if (average >= 80) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'F';

        System.out.printf("\nYour grade: %c", grade);

        scanner.close();
    }
}
