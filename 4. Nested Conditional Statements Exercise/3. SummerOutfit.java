import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";

        if ("Morning".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else {
                if (degrees >= 25) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
            }
        } else if ("Afternoon".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            } else {
                if (degrees >= 25) {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
            }
        } else if ("Evening".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else {
                if (degrees >= 25) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
            }
        }

        System.out.printf("It`s %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
