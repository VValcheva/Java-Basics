import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String in = scan.nextLine();
        String out = scan.nextLine();

        if (in.equals("m") && out.equals("cm")) {
            num = num * 100;

        } else if (in.equals("m") && out.equals("mm")) {
            num = num * 1000;

        } else if (in.equals("mm") && out.equals("cm")) {
            num = num / 10;

        } else if (in.equals("mm") && out.equals("m")) {
            num = num / 1000;
        } else if (in.equals("cm") && out.equals("m")) {
            num = num / 100;

        } else if (in.equals("cm") && out.equals("mm")) {
            num = num * 10;

        }
        System.out.printf("%.3f", num);
    }
}


