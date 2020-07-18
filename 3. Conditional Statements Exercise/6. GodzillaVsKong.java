import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double clothPricePeople = clothPrice * people;
        double decor = budget * 0.1;

        if (people > 150) {
            clothPricePeople = clothPricePeople * 0.9;
        }
        if (clothPricePeople + decor > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (clothPricePeople + decor) - budget);
        }
        if (clothPricePeople + decor <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - (clothPricePeople + decor));
        }
    }
}