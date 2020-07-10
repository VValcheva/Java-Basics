import java.util.Scanner;

public class AlcoholMarket {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double whiskyPrice = Double.parseDouble(scan.nextLine());
            double beerLitre = Double.parseDouble(scan.nextLine());
            double wineLitre = Double.parseDouble(scan.nextLine());
            double brandyLitre = Double.parseDouble(scan.nextLine());
            double whiskyLitre = Double.parseDouble(scan.nextLine());

            double brandyPrice = whiskyPrice / 2;
            double winePrice = brandyPrice - (0.4 * brandyPrice);
            double beerPrice = brandyPrice - (0.8 * brandyPrice);

            double whiskySum = whiskyLitre * whiskyPrice;
            double brandySum = brandyLitre * brandyPrice;
            double beerSum = beerLitre * beerPrice;
            double wineSum = wineLitre * winePrice;

            double all = whiskySum + brandySum + beerSum + wineSum;

            System.out.printf("%.2f", all);
    }
}
