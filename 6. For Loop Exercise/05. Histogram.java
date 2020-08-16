import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < 200) {
                p1Count++;
            } else if (num < 400) {
                p2Count++;
            } else if (num < 600) {
                p3Count++;
            } else if (num < 800) {
                p4Count++;
            } else {
                p5Count++;
            }
        }

        double p1Percent = (p1Count * 1.0 / n) * 100;
        double p2Percent = (p2Count * 1.0 / n) * 100;
        double p3Percent = (p3Count * 1.0 / n) * 100;
        double p4Percent = (p4Count * 1.0 / n) * 100;
        double p5Percent = (p5Count * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);
    }
}
