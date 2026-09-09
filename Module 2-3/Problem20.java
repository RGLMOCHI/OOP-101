import java.util.Scanner;
import java.text.DecimalFormat;

public class StorePurchaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.###");

        System.out.println("========================================");
        System.out.println("COMPLETE STORE PURCHASE CALCULATOR");
        System.out.println("By Roberto Romano Lim");
        System.out.println("========================================");

        System.out.print("Enter Product Price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Discount Percentage: ");
        double discountPercentage = scanner.nextDouble();

        System.out.print("Enter Amount Paid: ");
        double amountPaid = scanner.nextDouble();

        double grossAmount = productPrice * quantity;

        double discountAmount =
                grossAmount * (discountPercentage / 100);

        double discountedAmount =
                grossAmount - discountAmount;

        double vat = discountedAmount * 0.12;

        double finalBill =
                discountedAmount + vat;

        double changeDifference =
                amountPaid - finalBill;

        boolean paymentEnough =
                amountPaid >= finalBill;

        String paymentStatus = paymentEnough
                ? "SUFFICIENT PAYMENT"
                : "INSUFFICIENT PAYMENT";

        String resultLabel = paymentEnough
                ? "Change"
                : "Difference";

        System.out.println();
        System.out.println("PURCHASE SUMMARY");
        System.out.println(
                "Gross: " + format.format(grossAmount)
        );
        System.out.println(
                "Discount: " + format.format(discountAmount)
        );
        System.out.println(
                "After Discount: "
                + format.format(discountedAmount)
        );
        System.out.println(
                "VAT: " + format.format(vat)
        );
        System.out.println(
                "Final Bill: " + format.format(finalBill)
        );
        System.out.println(
                resultLabel + ": "
                + format.format(changeDifference)
        );
        System.out.println(
                "Status: " + paymentStatus
        );

        scanner.close();
    }
}
