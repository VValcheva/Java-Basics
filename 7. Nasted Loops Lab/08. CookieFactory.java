import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int flour = 0;
        int eggs = 0;
        int sugar = 0;

        for (int i = 1; i <= n; i++) {
            String product = scan.nextLine();

            while (!"Bake!".equals(product)) {

                switch (product) {
                    case "flour":
                        flour++;
                        break;
                    case "eggs":
                        eggs++;
                        break;
                    case "sugar":
                        sugar++;
                        break;
                }

                product = scan.nextLine();
            }

            if (flour == 0 || eggs == 0 || sugar == 0) {
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            } else {
                System.out.println("Baking batch number " + i + "...");
                flour = 0;
                eggs = 0;
                sugar = 0;
            }
        }
    }
}
