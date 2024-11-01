package demo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    private Queue<String> ticketQueue = new LinkedList<>();

    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
    }

    public void processTicket() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("Processing ticket: " + ticketQueue.poll());
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayTickets() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("Pending tickets:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        } else {
            System.out.println("No pending tickets.");
        }
    }

    public static void main(String[] args) {
        CustomerSupportSystem css = new CustomerSupportSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Ticket\n2. Process Ticket\n3. Display Tickets\n4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter ticket description:");
                    String ticket = scanner.nextLine();
                    css.addTicket(ticket);
                    break;
                case 2:
                    css.processTicket();
                    break;
                case 3:
                    css.displayTickets();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
