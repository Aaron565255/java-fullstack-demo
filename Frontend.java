public class Frontend {
    public static void main(String[] args) {
        Backend backend = new Backend();
        System.out.println("Frontend received: " + backend.getData());
    }
}
