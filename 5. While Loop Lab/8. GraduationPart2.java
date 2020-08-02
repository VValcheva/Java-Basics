import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = 1;
        double gradeSum = 0;
        int notPassed = 0;

        while (count <= 12 && notPassed < 2) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                count++;
                gradeSum += grade;

            } else {
                notPassed += 1;
            }
        }

        double avgGrade = gradeSum / 12;

        if (notPassed < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, count);
        }
    }
}