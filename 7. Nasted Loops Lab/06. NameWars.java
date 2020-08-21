import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String name = scan.nextLine();

        String winner = "";

        while (!name.equals("STOP")) {
            int number = 0;

            for (int i = 0; i < name.length(); i++) {
                number += name.charAt(i);
            }

            if (number > max) {
                max = number;
                winner = name;
            }

            name = scan.nextLine();
        }

        System.out.printf("Winner is %s - %d!", winner, max);
    }
}
