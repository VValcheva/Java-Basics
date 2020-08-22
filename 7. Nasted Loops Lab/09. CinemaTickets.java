import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();

        int totalTickets = 0;

        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scan.nextLine());
            int totalSeats = seats;
            String ticketType = scan.nextLine();

            while (!ticketType.equals("End")) {
                if (ticketType.equals("student")) {
                    studentTickets++;
                } else if (ticketType.equals("standard")) {
                    standardTickets++;
                } else {
                    kidsTickets++;
                }
                seats--;
                totalTickets++;

                if (seats == 0) {
                    break;
                }
                ticketType = scan.nextLine();
            }
            double percents = ((totalSeats - seats) * 1.00 / totalSeats) * 100.00;

            System.out.printf("%s - %.2f%% full.%n", movie, percents);
            movie = scan.nextLine();
        }

        System.out.println("Total tickets: " + totalTickets);

        double student = 100 - ((totalTickets - studentTickets) * 1.00 / totalTickets) * 100;
        double standard = 100 - ((totalTickets - standardTickets) * 1.00 / totalTickets) * 100;
        double kids = 100 - ((totalTickets - kidsTickets) * 1.00 / totalTickets) * 100;

        System.out.printf("%.2f%% student tickets.%n", student);
        System.out.printf("%.2f%% standard tickets.%n", standard);
        System.out.printf("%.2f%% kids tickets.%n", kids);
    }
}
