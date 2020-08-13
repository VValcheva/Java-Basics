import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double cost = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneyCount = 0;
        int toysCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCount++;

            } else {
                toysCount++;
            }
        }

        double savedMoney = toysCount * toyPrice;

        for (int i = 1; i <= moneyCount; i++) {
            savedMoney += (10 * i);
        }
        savedMoney -= moneyCount;

        if (savedMoney >= cost) {
            System.out.printf("Yes! %.2f", savedMoney - cost);

        } else {
            System.out.printf("No! %.2f", cost - savedMoney);
        }
    }
}
