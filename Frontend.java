import java.util.Scanner;

public class Frontend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Backend backend = new Backend();

        System.out.println("===== Welcome to Java Online Store =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(backend.greetUser(name));

        System.out.println("\nAvailable Product IDs: 101, 102, 103");
        System.out.print("Enter Product ID to view: ");
        String productId = sc.nextLine();

        System.out.println("Product: " + backend.getProduct(productId));
        System.out.println("========================================");
    }
}

