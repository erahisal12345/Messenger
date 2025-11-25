public class SendMessage {
    private String[] historyMessage = new String[100];
    private int cnt = 0;

    public String[] getHistoryMessage() { return historyMessage; }

    public void sendMessage(User sender, User receiver, String text, String time) {
        Message message = new Message(sender, receiver, text, time);
        historyMessage[cnt ++] = text;
        System.out.println("Отправлено личное сообщение от " + sender.getName() + " " + sender.getID() + " для " + receiver.getName() + " " + receiver.getID());
    }

    public void sendMessage(User sender, Group group, String text, String time) {
        Message message = new Message(sender, group, text, time);
        historyMessage[cnt ++] = text;
        System.out.println("Отправлено сообщение в группу");
    }

    public void sendMessage(User sender, Channel channel, String text, String time) {
        Message message = new Message(sender, channel, text, time);
        historyMessage[cnt ++] = text;
        System.out.println("Отправлен пост в канал");
    }
}
