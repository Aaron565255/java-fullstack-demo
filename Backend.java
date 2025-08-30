import java.util.HashMap;

public class Backend {
    private HashMap<String, String> database;

    public Backend() {
        database = new HashMap<>();
        database.put("101", "Laptop");
        database.put("102", "Smartphone");
        database.put("103", "Headphones");
    }

    public String getProduct(String id) {
        return database.getOrDefault(id, "Product not found");
    }

    public String greetUser(String name) {
        return "Hello, " + name + "! Welcome to our online store.";
    }
}
