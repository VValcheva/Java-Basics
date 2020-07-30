import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        while (number < 1 || number > 100) {
            System.out.println("Invalid number!");
            number = Integer.parseInt(scan.nextLine());
        }

        System.out.println("The number is: " + number);
    }
}
