import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hallLength = Double.parseDouble(scanner.nextLine());
        double hallWight = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double areaHall = (hallLength * 100) * (hallWight * 100);
        double peika = areaHall / 10;
        double freeArea = areaHall - ((wardrobeSide * 100) * (wardrobeSide * 100)) - peika;
        double dancers = freeArea / (40 + 7000);
        double down = Math.floor(dancers);

        System.out.printf("%.0f", down);

    }
}
