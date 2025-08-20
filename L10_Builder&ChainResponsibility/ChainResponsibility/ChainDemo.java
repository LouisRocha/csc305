package ChainResponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        // Create handlers
        Handler low = new LowHandler();
        Handler medium = new MediumHandler();
        Handler high = new HighHandler();

        // Chain them together
        low.setSuccessor(medium);
        medium.setSuccessor(high);

        // Requests to process
        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int r : requests) {
            low.handleRequest(r);
        }
    }
}

