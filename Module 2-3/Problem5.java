import java.util.Scanner;

public class MobilePhoneRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("MOBILE PHONE RECORD");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Smartphone Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Smartphone Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter RAM Capacity: ");
        int ramCapacity = scanner.nextInt();

        System.out.print("Enter Storage Capacity: ");
        int storageCapacity = scanner.nextInt();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.println();
        System.out.println("DISPLAYING PHONE SPECIFICATIONS...");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramCapacity + " GB");
        System.out.println("Storage: " + storageCapacity + " GB");
        System.out.printf("Price: PHP %.2f%n", price);

        scanner.close();
    }
}
