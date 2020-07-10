import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int chef = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int gofreti = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());

        double cakesPrice = cake * 45;
        double gofretiPrice = gofreti * 5.80;
        double pancakePrice = pancake * 3.20;
        double PriceForDay = chef * (cakesPrice + gofretiPrice + pancakePrice);
        double allPrice = PriceForDay * days;
        double lastPrice = allPrice - (allPrice / 8);

        System.out.printf("%.2f", lastPrice);
    }
}
