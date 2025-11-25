public class User {
    private String name;
    private String[] sentMessages;
    private String[] receivedMessages;

    public User(String name) {
        this.name = name;
        this.sentMessages = new String[100];
        this.receivedMessages = new String[100];
    }

    public String getName() { return name; }
    public String[] getSentMessages() { return sentMessages; }
    public String[] getReceivedMessages() { return receivedMessages; }

}
