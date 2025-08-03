import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GraveyardManager manager = new GraveyardManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Model Graveyard Logger ===");

        while (true) {
            System.out.println("\n1. Add Retired Model\n2. View All Models\n3. Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Model Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Reason of Failure: ");
                    String reason = scanner.nextLine();
                    System.out.print("Date Retired (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    manager.addModel(new Model(name, reason, date));
                    break;
                case "2":
                    manager.displayModels();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
