import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Frontend {
    public static void main(String[] args) {
        Backend backend = new Backend();

        try (FileWriter writer = new FileWriter("index.html")) {
            writer.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Java Online Store</title>\n</head>\n<body>\n");
            writer.write("<h1>Welcome to Java Online Store</h1>\n");
            writer.write("<h2>Available Products</h2>\n<ul>\n");

            for (Map.Entry<String, Integer> entry : backend.getStock().entrySet()) {
                writer.write("<li>" + entry.getKey() + " - Stock: " + entry.getValue() + "</li>\n");
            }

            writer.write("</ul>\n");
            writer.write("<p>To order, run Jenkins build with product ID as parameter.</p>\n");
            writer.write("</body>\n</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("index.html generated successfully!");
    }
}

