import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double sum1 = dogs * 2.5;
        double sum2 = animals * 4;
        double sum = sum1 + sum2;

        System.out.printf("%.2f lv.", sum);
    }
}