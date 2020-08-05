import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSteps = 0;
        String input = scan.nextLine();

        boolean isReached = false;
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);

            totalSteps += steps;

            if (totalSteps >= 10000) {
                isReached = true;
                break;
            }

            input = scan.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scan.nextLine());
            totalSteps += stepsToHome;
            if (totalSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
            } else {
                double difference = 10000 - totalSteps;
                System.out.printf("%.0f more steps to reach goal.", difference);
            }
        } else if (isReached) {
            System.out.println("Goal reached! Good job!");
        }
    }
}
