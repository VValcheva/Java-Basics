import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int judges = Integer.parseInt(scan.nextLine());
        double totalSumGrade = 0;
        int gradeCount = 0;

        String presentationName = scan.nextLine();

        while (!"Finish".equals(presentationName)) {
            double currentPresSumGrade = 0;

            for (int i = 1; i <= judges; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                currentPresSumGrade += grade;
                totalSumGrade += grade;
                gradeCount++;
            }

            double avg = currentPresSumGrade / judges;
            System.out.printf("%s - %.2f.%n", presentationName, avg);

            presentationName = scan.nextLine();
        }

        double totalAvg = totalSumGrade / gradeCount;
        System.out.printf("Student's final assessment is %.2f.", totalAvg);
    }
}