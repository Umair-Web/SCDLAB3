/**
 * 
 */
package Marksheet;

import java.util.Scanner;

public class MarkSheet {
    private String studentName;
    private int totalMarks;
    private int obtainedMarks;
    private double percentage;
    private char grade;
    private double gpa;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        totalMarks = scanner.nextInt();

        System.out.print("Enter Obtained Marks: ");
        obtainedMarks = scanner.nextInt();

        scanner.close();

        calculatePercentage();
        calculateGradeAndGPA();
    }

    private void calculatePercentage() {
        percentage = ((double) obtainedMarks / totalMarks) * 100;
    }

    private void calculateGradeAndGPA() {
        if (percentage >= 90) {
            grade = 'A';
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = 'B';
            gpa = 3.0;
        } else if (percentage >= 70) {
            grade = 'C';
            gpa = 2.0;
        } else if (percentage >= 60) {
            grade = 'D';
            gpa = 1.0;
        } else {
            grade = 'F';
            gpa = 0.0;
        }
    }

    public void displayMarkSheet() {
        System.out.println("\n--- Mark Sheet ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f\n", gpa);
    }

    public static void main(String[] args) {
        MarkSheet markSheet = new MarkSheet();
        markSheet.inputDetails();
        markSheet.displayMarkSheet();
    }
}
