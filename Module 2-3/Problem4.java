import java.util.Scanner;

public class HotelGuestInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("HOTEL GUEST INFORMATION");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Guest Name: ");
        String guestName = scanner.nextLine();

        System.out.print("Enter Room Number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter Number of Nights: ");
        int numberOfNights = scanner.nextInt();

        System.out.print("Enter Room Rate: ");
        double roomRate = scanner.nextDouble();

        System.out.println();
        System.out.println("DISPLAYING HOTEL RECORD...");
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomNumber);
        System.out.println("Nights: " + numberOfNights);
        System.out.printf("Room Rate: PHP %.2f%n", roomRate);

        scanner.close();
    }
}
