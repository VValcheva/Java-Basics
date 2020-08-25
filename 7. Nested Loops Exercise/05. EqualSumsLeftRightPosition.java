import java.util.Scanner;

public class EqualSumsLeftRightPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numA = Integer.parseInt(scan.nextLine());
        int numB = Integer.parseInt(scan.nextLine());

        for (int i = numA; i <= numB; i++) {
            String number = "" + i;

            int leftSum = 0;
            int rightSum = 0;
            int midNum = 0;

            for (int j = 0; j < number.length(); j++) {
                if (j < 2) {
                    leftSum += Integer.parseInt("" + number.charAt(j));
                } else if (j == 2) {
                    midNum = Integer.parseInt("" + number.charAt(j));
                } else {
                    rightSum += Integer.parseInt("" + number.charAt(j));
                }
            }

            if (rightSum == leftSum) {
                System.out.print(i + " ");
                continue;
            } else if (rightSum > leftSum) {
                leftSum += midNum;
            } else {
                rightSum += midNum;
            }

            if (rightSum == leftSum) {
                System.out.print(i + " ");
            }
        }
    }
}