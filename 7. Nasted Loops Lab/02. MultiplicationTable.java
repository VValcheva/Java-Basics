public class MultiplicationTable {
    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d * %d = %d%n", number, multiplier, number * multiplier);
            }
        }
    }
}
