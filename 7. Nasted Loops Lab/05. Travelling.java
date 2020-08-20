import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        double sum = 0;

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scan.nextLine());
            while (sum < budget) {
                double savedMoney = Double.parseDouble(scan.nextLine());
                sum += savedMoney;
            }

            System.out.println("Going to " + destination + "!");
            destination = scan.nextLine();
            sum = 0;
        }
    }
}
