import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int table = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWight = Double.parseDouble(scanner.nextLine());

        double areaRectangle = table * (tableLength + 2 * 0.30) * (tableWight + 2 * 0.30);
        double areaSquere =  table * (tableLength / 2) * (tableLength / 2);
        double USD = (areaRectangle * 7) + (areaSquere * 9);
        double BGN = USD * 1.85;

        System.out.printf("%.2f USD", USD);
        System.out.println();
        System.out.printf("%.2f BGN", BGN);
    }
}
