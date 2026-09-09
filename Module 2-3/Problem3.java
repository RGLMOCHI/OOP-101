import java.util.Scanner;

public class VehicleInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("VEHICLE INFORMATION");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Plate Number: ");
        String plateNumber = scanner.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int manufacturingYear = scanner.nextInt();

        System.out.print("Enter Engine Displacement: ");
        double engineDisplacement = scanner.nextDouble();

        System.out.println();
        System.out.println("DISPLAYING VEHICLE RECORD...");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate: " + plateNumber);
        System.out.println("Year: " + manufacturingYear);
        System.out.printf("Engine: %.1f L%n", engineDisplacement);

        scanner.close();
    }
}
