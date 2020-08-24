import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        for (int i = num1; i <= num2; i++) {
            String currentNumber = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNumber.length(); j++) {
                int num = Integer.parseInt("" + currentNumber.charAt(j));

                if (j % 2 == 0) {
                    oddSum += num;
                } else {
                    evenSum += num;
                }
            }

            if (oddSum == evenSum) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}