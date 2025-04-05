import java.util.Scanner;
import java.time.LocalDateTime;

public class TaskLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder taskLog = new StringBuilder();
        System.out.print("Enter the number of tasks: ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numTasks; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            LocalDateTime timestamp = LocalDateTime.now();
            taskLog.append("Task: ").append(task).append(" | Time: ").append(timestamp).append("\n");
        }
        System.out.println("\n--- Task Log ---");
        System.out.println(taskLog.toString());
        scanner.close();
    }
}
