public class User {
    private String name;
    private String[] sentMessages;
    private String[] receivedMessages;
    private int cnt = 0;

    public User(String name) {
        this.name = name;
        this.sentMessages = new String[100];
        this.receivedMessages = new String[100];
    }

    public void sendMessage(User sender, User receiver, String text, String time) {
        Message message = new Message(sender, receiver, text, time);
        receiver.receivedMessages[cnt] = text;
        sender.sentMessages[cnt] = text;
        cnt ++;
    }

    public String getName() { return name; }
    public String[] getSentMessages() { return sentMessages; }
    public String[] getReceivedMessages() { return receivedMessages; }

    public User createUser(String name) {
        User user = new User(name);
    }

    public User[] users(User user) {

    }
}
