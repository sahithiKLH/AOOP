package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Task\n2. Update Task\n3. Remove Task\n4. Display Tasks\n5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter task:");
                    String task = scanner.nextLine();
                    app.addTask(task);
                    break;
                case 2:
                    System.out.println("Enter task index to update:");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.println("Enter new task description:");
                    String newTask = scanner.nextLine();
                    app.updateTask(indexToUpdate - 1, newTask);
                    break;
                case 3:
                    System.out.println("Enter task index to remove:");
                    int indexToRemove = scanner.nextInt();
                    app.removeTask(indexToRemove - 1);
                    break;
                case 4:
                    app.displayTasks();
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

