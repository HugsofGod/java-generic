import java.util.Scanner;

public class LibraryCatalogApp {
    private static GenericCatalog<LibraryItem> catalog = new GenericCatalog<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Catalog Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void addItem(Scanner scanner) {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter item ID:");
        String itemID = scanner.nextLine();

        LibraryItem item = new LibraryItem(title, author, itemID);
        catalog.addItem(item);
        System.out.println("Item added successfully.");
    }

    private static void removeItem(Scanner scanner) {
        System.out.println("Enter item ID to remove:");
        String itemID = scanner.nextLine();

        if (catalog.removeItemById(itemID)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void viewItems() {
        for (LibraryItem item : catalog.getAllItems()) {
            System.out.println(item);
        }
    }
}
