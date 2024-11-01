package demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
    private Deque<String> history = new ArrayDeque<>();
    private Deque<String> forwardHistory = new ArrayDeque<>();

    public void visitPage(String url) {
        history.push(url);
        forwardHistory.clear();
    }

    public void goBack() {
        if (!history.isEmpty()) {
            forwardHistory.push(history.pop());
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            history.push(forwardHistory.pop());
        } else {
            System.out.println("No next page.");
        }
    }

    public void displayCurrentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No pages in history.");
        }
    }

    public static void main(String[] args) {
        BrowsingHistory bh = new BrowsingHistory();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Visit Page\n2. Go Back\n3. Go Forward\n4. Display Current Page\n5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter URL:");
                    String url = scanner.nextLine();
                    bh.visitPage(url);
                    break;
                case 2:
                    bh.goBack();
                    break;
                case 3:
                    bh.goForward();
                    break;
                case 4:
                    bh.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        scanner.close();
    }
}

