import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int max = Integer.MIN_VALUE;

        while (count < n) {
            int num = Integer.parseInt(scan.nextLine());
            count++;
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
