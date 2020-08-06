import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakeWidth = Integer.parseInt(scan.nextLine());

        double volume = cakeLength * cakeWidth;

        String input = scan.nextLine();
        int pieces = 0;

        while (!input.equals("STOP")) {
            pieces = Integer.parseInt(input);
            volume -= pieces;

            if (volume < 0) {
                break;
            }
            input = scan.nextLine();
        }

        if (0 < volume) {
            System.out.printf("%.0f pieces are left.", Math.abs(volume));

        } else {
            System.out.printf("No more cake left! You need %.0f pieces more.", Math.abs(volume));
        }
    }
}


