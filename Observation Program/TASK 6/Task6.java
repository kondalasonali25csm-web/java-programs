import java.util.Scanner;

class Student {
    // Data members
    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor to initialize student details
    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        // Apply String operations: clean whitespace and format name to UPPERCASE
        this.studentName = studentName.trim().toUpperCase();
        this.marks = marks;
    }

    // Method to calculate total marks
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        if (marks.length == 0) return 0.0;
        return (double) calculateTotal() / marks.length;
    }

    // Method to find highest marks
    public int findHighest() {
        int highest = marks[0];
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }
        return highest;
    }

    // Method to find lowest marks
    public int findLowest() {
        int lowest = marks[0];
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }
        return lowest;
    }

    // Method to calculate percentage rounded to 2 decimal places
    public double calculatePercentage() {
        if (marks.length == 0) return 0.0;
        // Assuming max marks per subject is 100
        double percentage = ((double) calculateTotal() / (marks.length * 100)) * 100;
        // Round to 2 decimal places using Math.round()
        return Math.round(percentage * 100.0) / 100.0;
    }

    // Method to determine grade based on percentage
    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
    }

    // Method to get a simple performance remark based on the grade
    public String getPerformanceRemark() {
        String grade = determineGrade();
        switch (grade) {
            case "A+": return "Excellent performance! Keep up the brilliant work.";
            case "A":  return "Very good job! Highly consistent.";
            case "B":  return "Good performance, but there is room for growth.";
            case "C":  return "Satisfactory performance. Put in more effort.";
            case "D":  return "Passed, but needs significant academic improvement.";
            default:   return "Failed. Critical improvement needed. Seek immediate help.";
        }
    }

    // Method to display the complete performance report
    public void displayPerformanceReport() {
        double percentage = calculatePercentage();
        boolean hasPassed = percentage >= 50.0;

        System.out.println("\n==============================================");
        System.out.println("          STUDENT PERFORMANCE REPORT          ");
        System.out.println("==============================================");
        System.out.println("Roll Number        : " + rollNumber);
        System.out.println("Student Name       : " + studentName + " (" + studentName.length() + " characters)");
        System.out.println("----------------------------------------------");
        System.out.print("Subject Marks      : [ ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("]");
        System.out.println("----------------------------------------------");
        System.out.println("Total Marks        : " + calculateTotal());
        System.out.println("Average Marks      : " + calculateAverage());
        System.out.println("Highest Subject Mark: " + findHighest());
        System.out.println("Lowest Subject Mark : " + findLowest());
        System.out.println("Final Percentage   : " + percentage + "%");
        System.out.println("Assigned Grade     : " + determineGrade());
        System.out.println("Result Status      : " + (hasPassed ? "PASSED" : "FAILED"));
        System.out.println("Academic Remark    : " + getPerformanceRemark());
        System.out.println("==============================================");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Student Academic Details ---");
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline character

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        // System specified for 5 subjects
        int[] subjectsMarks = new int[5];
        System.out.println("Enter marks for 5 subjects (out of 100 each):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectsMarks[i] = scanner.nextInt();
        }

        // Instantiating the Student object
        Student student = new Student(rollNo, name, subjectsMarks);

        // Generating the comprehensive layout
        student.displayPerformanceReport();

        scanner.close();
    }
}
