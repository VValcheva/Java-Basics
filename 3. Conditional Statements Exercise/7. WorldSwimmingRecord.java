import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double metri = Double.parseDouble(scanner.nextLine());
        double vreme = Double.parseDouble(scanner.nextLine());
        double time = vreme * metri;
        double zabavqne = Math.floor(metri / 15) * 12.5;
        double totalTime = time + zabavqne;
        double nedostig = Math.abs(seconds - totalTime);
        if (seconds <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", nedostig);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}

