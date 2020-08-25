import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int primeSum = 0;
        int notPrimeSum = 0;
        while (!"stop".equals(input)) {

            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
            } else if (num == 1) {
                primeSum += 1;
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += num;
                } else {
                    notPrimeSum += num;
                }
            }

            input = scan.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", notPrimeSum);
    }
}

