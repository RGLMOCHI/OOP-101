import java.util.Scanner;

public class RestaurantMenuItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("RESTAURANT MENU ITEM");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Food Item: ");
        String foodItem = scanner.nextLine();

        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Serving Size: ");
        int servingSize = scanner.nextInt();

        System.out.println();
        System.out.println("DISPLAYING MENU ITEM RECORD...");
        System.out.println("Item: " + foodItem);
        System.out.println("Category: " + category);
        System.out.printf("Price: PHP %.2f%n", price);
        System.out.println("Serving Size: " + servingSize);

        scanner.close();
    }
}
