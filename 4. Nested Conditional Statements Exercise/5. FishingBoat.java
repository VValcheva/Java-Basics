import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String seasson = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());
        double price = 0.00;
        double remainder = 0.00;

        boolean Spring = (seasson.equals("Spring"));
        boolean Summer = (seasson.equals("Summer"));
        boolean Autumn = (seasson.equals("Autumn"));
        boolean Winter = (seasson.equals("Winter"));

        if (Spring) {
            price = 3000;
        } else if (Summer) {
            price = 4200;
        } else if (Autumn) {
            price = 4200;
        } else {
            price = 2600;
        }

        if (fisher <= 6) {
            price = price * 0.90;
        } else if (fisher >= 7 && fisher <= 11) {
            price = price * 0.85;
        } else if (fisher >= 12) {
            price = price * 0.75;
        }
        if (seasson.equals("Autumn") && (fisher % 2 == 0)) {
            price = price * 0.95;
        }
        if(budget >= price) {
            remainder = Math.abs(budget - price);
            System.out.printf("Yes! You have %.2f leva left.", remainder);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", remainder);
        }

    }
}

