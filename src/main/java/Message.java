public class Message {
    private User sender;
    private User receiver;
    private String text;
    private String time;

    public Message(User sender, User receiver, String text, String time) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.time = time;
    }

    public User getSender() { return sender; }
    public User getReceiver() { return receiver; }
    public String getText() { return text; }
    public String getTime() { return time; }


}
