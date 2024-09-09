package ii;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private ArrayList<String> tasks;

    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Update a task's description by index
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
            System.out.println("Task at index " + index + " updated to: " + newTask);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListApp toDoList = new ToDoListApp();

        while (true) {
            System.out.println("\nTo-Do List Options:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newTask = scanner.nextLine();
                    toDoList.updateTask(updateIndex, newTask);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting To-Do List application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}