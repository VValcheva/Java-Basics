import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int limit = Integer.parseInt(scan.nextLine());

        boolean combinationFound = false;
        int counter = 0;

        for (int first = begin; first <= end; first++) {
            for (int second = begin; second <= end; second++) {
                counter++;
                if (first + second == limit) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, first, second, limit);
                    combinationFound = true;
                    break;
                }
            }

            if (combinationFound) {
                break;
            }
        }

        if (!combinationFound){
            System.out.printf("%d combinations - neither equals %d%n", counter, limit);
        }
    }
}
