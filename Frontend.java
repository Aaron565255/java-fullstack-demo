public class Frontend {
    public static void main(String[] args) {
        Backend backend = new Backend();

        String name = "JenkinsUser"; // Default value for non-interactive mode
        String productId = "101";    // Default product ID

        System.out.println("===== Welcome to Java Online Store =====");
        System.out.println(backend.greetUser(name));

        System.out.println("\nAvailable Product IDs: 101, 102, 103");
        System.out.println("Selected Product: " + backend.getProduct(productId));
        System.out.println("========================================");
    }
}
