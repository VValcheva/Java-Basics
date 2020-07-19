import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dohod = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minR = Double.parseDouble(scanner.nextLine());
        double SocialScholarship = 0.00;
        double ExcellentScholarship = 0.00;

        if(dohod < minR && averageSuccess >= 4.5) {
            SocialScholarship = Math.floor(minR * 0.35);
        }
        if(averageSuccess >= 5.50) {
            ExcellentScholarship = Math.floor(averageSuccess * 25);
         if(SocialScholarship <= ExcellentScholarship) {
             System.out.printf("You get a scholarship for excellent results %.0f BGN", ExcellentScholarship);
         }
            } else if(SocialScholarship > ExcellentScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", SocialScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}