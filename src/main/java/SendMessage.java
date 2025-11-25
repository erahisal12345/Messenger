public class SendMessage {
    private String[] historyMessage;
    private int cnt = 0;

    public String[] getHistoryMessage() { return historyMessage; }

    public void sendMessage(User sender, User receiver, String text, String time) {
        Message message = new Message(sender, receiver, text, time);
        historyMessage[cnt] = text;
        cnt ++;
    }
}
