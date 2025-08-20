package ChainResponsibility;

class LowHandler implements Handler {
    private Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("LowHandler handled request: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class MediumHandler implements Handler {
    private Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("MediumHandler handled request: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class HighHandler implements Handler {
    private Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 20) {
            System.out.println("HighHandler handled request: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

