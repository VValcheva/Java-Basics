import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        if (flower.equals("Roses")) {
            if (quantity >= 80) {
                price = (quantity * 5) * 0.90;
            } else {
                price = quantity * 5;
            }
        } else if (flower.equals("Dahlias")) {
            if (quantity >= 90) {
                price = (quantity * 3.80) * 0.85;
            } else {
                price = quantity * 3.80;
            }
        } else if (flower.equals("Tulips")) {
            if (quantity >= 80) {
                price = (quantity * 2.80) * 0.85;
            } else {
                price = quantity * 2.80;
            }
        } else if (flower.equals("Narcissus")) {
            if (quantity < 120) {
                price = (quantity * 3) * 0.15;
            } else {
                price = quantity * 3;
            }
        } else {
            if (quantity < 80) {
                price = (quantity * 2.50) * 0.20;
            } else {
                price = quantity * 2.50;
            }
        }
        double remainder = Math.abs(price - budget);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, remainder);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", remainder);
        }

    }
}
