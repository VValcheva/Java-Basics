import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        int min = Integer.MAX_VALUE;

        while (count < n) {
            int num = Integer.parseInt(scan.nextLine());
            count++;
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
