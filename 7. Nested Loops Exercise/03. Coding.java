import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  n = scan.nextLine();

        for (int i = n.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt("" + n.charAt(i));
            int numberInAscii = number + 33;

            if (number == 0) {
                System.out.println("ZERO");
            } else {
                for (int j = 0; j < number; j++) {
                    System.out.print((char) numberInAscii);
                }

                System.out.println();
            }
        }
    }
}