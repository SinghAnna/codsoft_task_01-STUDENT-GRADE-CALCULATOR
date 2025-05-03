
import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        System.out.print("Enter Number of Subject :- ");
        Byte NumOfSubject = scanner.nextByte();

        int[] marks = new int[NumOfSubject];

        for (int i = 0; i < NumOfSubject; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

             // Validating mark input
             while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input! Please enter marks between 0 and 100: ");
                marks[i] = scanner.nextInt();
            }
            totalMarks += marks[i];
        }

            // Calculating average percentage
            double average = (double) totalMarks / NumOfSubject;

            // Calculating grade
             char grade;
             if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else if (average >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            // Display Result
            System.out.println("\n ---- Result -----");
            System.out.println("Total Marks: " + totalMarks + " out of " + (NumOfSubject * 100));
            System.out.printf("Average Percentage: %.2f%%\n", average);
            System.out.println("Grade: " + grade);
        
            scanner.close();
    }
}
