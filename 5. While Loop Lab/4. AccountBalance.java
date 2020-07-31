import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operationsCount = Integer.parseInt(scan.nextLine());

        double balance = 0.0;
        while (operationsCount > 0) {
            double amount = Double.parseDouble(scan.nextLine());

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", amount);
            balance += amount;

            operationsCount--;
        }

        System.out.printf("Total: %.2f", balance);
    }
}
