import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fishes = Integer.parseInt(scan.nextLine());
        double income = 0;
        boolean isFulfilled = true;
        int countFishes = 0;

        for (int i = 1; i <= fishes; i++) {
            String name = scan.nextLine();

            if ("Stop".equals(name)) {
                isFulfilled = false;
                break;
            }
            countFishes++;
            double kg = Double.parseDouble(scan.nextLine());

            int sum = 0;
            for (int j = 0; j < name.length(); j++) {
                int value = name.charAt(j);
                sum += value;
            }
            double price = sum / kg;

            if (i % 3 == 0) {
                income += price;
            } else {
                income -= price;
            }
        }

        if (isFulfilled) {
            System.out.println("Lyubo fulfilled the quota!");
        }

        if (income > 0) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", countFishes, income);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(income));
        }
    }
}