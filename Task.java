import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String dueDate;

    public Task(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }
}

public class TaskListApp {
    private ArrayList<Task> taskList;
    private Scanner scanner;

    public TaskListApp() {
        taskList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Task List App");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.next();
        System.out.print("Enter due date: ");
        String dueDate = scanner.next();
        Task task = new Task(title, dueDate);
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    private void removeTask() {
        System.out.print("Enter task title to remove: ");
        String title = scanner.next();
        for (Task task : taskList) {
            if (task.getTitle().equals(title)) {
                taskList.remove(task);
                System.out.println("Task removed successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    private void listTasks() {
        System.out.println("Task List:");
        for (Task task : taskList) {
            System.out.println("Title: " + task.getTitle() + ", Due Date: " + task.getDueDate());
        }
    }

    public static void main(String[] args) {
        TaskListApp app = new TaskListApp();
        app.run();
    }
}
