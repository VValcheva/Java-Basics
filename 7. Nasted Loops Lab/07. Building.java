import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scan.nextLine());
        int apartmentsCount = Integer.parseInt(scan.nextLine());

        for (int floor = floorsCount; floor >= 1; floor--) {
            for (int aptNum = 0; aptNum < apartmentsCount; aptNum++) {
                if (floor == floorsCount) {
                    System.out.printf("L%d%d ", floor, aptNum);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, aptNum);
                } else {
                    System.out.printf("A%d%d ", floor, aptNum);
                }
            }

            System.out.println();
        }
    }
}
