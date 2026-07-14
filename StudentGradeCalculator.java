import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

       try(Scanner scanner = new Scanner(System.in)) {

        System.out.println("Enter the marks of 5 subjects:");

        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();

        // Calculate Total Marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate Average Percentage
        double averagePercentage = totalMarks / 5.0;

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade Calculation
        if (averagePercentage >= 90) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: D");
        } else if (averagePercentage >= 50) {
            System.out.println("Grade: E");
        } else if (averagePercentage >= 40) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
       }
    }
}