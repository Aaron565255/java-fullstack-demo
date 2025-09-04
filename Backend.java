import java.util.HashMap;
import java.util.Map;

public class Backend {
    private Map<String, Integer> stock;

    public Backend() {
        stock = new HashMap<>();
        stock.put("101 - Laptop", 5);
        stock.put("102 - Mobile", 10);
        stock.put("103 - Headphones", 7);
    }

    public Map<String, Integer> getStock() {
        return stock;
    }

    public String orderProduct(String productId) {
        for (String product : stock.keySet()) {
            if (product.startsWith(productId)) {
                int qty = stock.get(product);
                if (qty > 0) {
                    stock.put(product, qty - 1);
                    return product + " ordered successfully! Remaining stock: " + (qty - 1);
                } else {
                    return product + " is OUT OF STOCK!";
                }
            }
        }
        return "Invalid Product ID!";
    }
}

