import java.util.Scanner;

public class UniversityStudentProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("UNIVERSITY STUDENT PROFILE");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Student Number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter Program: ");
        String program = scanner.nextLine();

        System.out.print("Enter Year Level: ");
        int yearLevel = scanner.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println();
        System.out.println("DISPLAYING STUDENT PROFILE...");
        System.out.println("Name: " + fullName);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
        System.out.printf("GPA: %.2f%n", gpa);

        scanner.close();
    }
}
