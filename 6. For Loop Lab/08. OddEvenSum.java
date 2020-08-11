import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(scan.nextLine());
            } else {
                oddSum += Integer.parseInt(scan.nextLine());
            }
        }

        if (oddSum == evenSum){
            System.out.println("Yes, sum = " + evenSum);
        } else {
            int diff = Math.abs(oddSum - evenSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
