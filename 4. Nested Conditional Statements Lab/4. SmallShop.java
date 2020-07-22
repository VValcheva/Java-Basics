import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine ();
        String town = scanner.nextLine ();
        double quatity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;

        if(town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = 0.50;
            } else if(product.equals("water")) {
                price = 0.80;
            } else if (product.equals("beer")) {
                price = 1.20;
            } else if(product.equals("sweets")) {
                price = 1.45;
            } else {
                price = 1.60;
            }
        } else if(town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.40;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if (product.equals("sweets")) {
                price = 1.30;
            } else {
                price = 1.50;
            }
        }else {
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.10;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else {
                    price = 1.55;
                }
        }
        double cost = price * quatity;
        System.out.println(cost);
    }
}
