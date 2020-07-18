import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.next());
        int minutes = Integer.parseInt(scanner.next());

        int minHours = hours * 60;
        int all = minHours + minutes + 15;

        int H = all / 60;
        int M = all % 60;

        if (M > 59) {
            H = H + 1;
        }

        if (H == 24) {
            H = 0;
        }

        if (M < 10) {
            System.out.printf("%d:0%d", H, M);
        } else {
            System.out.printf("%d:%d", H, M);
        }
    }
}

