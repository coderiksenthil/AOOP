package i;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagementSystem {
    // Task class to store task details
    static class Task {
        private String description;

        public Task(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // Add a new task
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    tasks.add(new Task(description));
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    // Update an existing task
                    System.out.print("Enter the task number to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over

                    if (updateIndex >= 0 && updateIndex < tasks.size()) {
                        System.out.print("Enter the new task description: ");
                        String newDescription = scanner.nextLine();
                        tasks.get(updateIndex).setDescription(newDescription);
                        System.out.println("Task updated successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    // Remove a task
                    System.out.print("Enter the task number to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over

                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        tasks.remove(removeIndex);
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    // Display all tasks
                    System.out.println("\nTask List:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i) + ". " + tasks.get(i).getDescription());
                        }
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Task Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}