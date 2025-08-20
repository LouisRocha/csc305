package ChainResponsibility;

interface Handler {
    void setSuccessor(Handler successor);
    void handleRequest(int request);
}
