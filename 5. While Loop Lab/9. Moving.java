import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int volume = width * length * height;

        String input = scan.nextLine();

        while (!input.equals("Done") && volume > 0) {
            int boxes = Integer.parseInt(input);
            volume -= boxes;

            if (volume < 0) {
                break;
            }

            input = scan.nextLine();
        }

        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }
    }
}
