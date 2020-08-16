import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num % 2 == 0) {
                p1Count++;
            }
            if (num % 3 == 0) {
                p2Count++;
            }
            if (num % 4 == 0) {
                p3Count++;
            }
        }

        double p1Percent = (p1Count * 1.0 / n) * 100;
        double p2Percent = (p2Count * 1.0 / n) * 100;
        double p3Percent = (p3Count * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
    }
}
