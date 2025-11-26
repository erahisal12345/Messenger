public class SendMessage {
    private Message[] historyMessage = new Message[100];
    private int cnt = 0;

    public Message[] getHistoryMessage() { return historyMessage; }

    public void sendMessage(User sender, User receiver, String text, String time) {
        Message message = new Message(sender, receiver, text, time);
        historyMessage[cnt ++] = message;
        System.out.println("Отправлено личное сообщение от " + sender.getName() + " ID: " + sender.getID() + " для " + receiver.getName() + " ID: " + receiver.getID());
    }

    public void sendMessage(User sender, Group group, String text, String time) {
        if (group.containsMember(sender)) {
            Message message = new Message(sender, group.getUser(), text, time);
            historyMessage[cnt++] = message;
            System.out.println("Отправлено сообщение в группу " + group.getName());
        } else {
            System.out.println(sender.getName() + " не состоит в группе");
        }
    }

    public void sendMessage(User sender, Channel channel, String text, String time) {
        if (sender.equals(channel.getAdmin())) {
            Message message = new Message(sender, channel.getUser(), text, time);
            historyMessage[cnt ++] = message;
            System.out.println("Отправлен пост в канал");
        } else {
            System.out.println("Пользователь не является администратором канала");
        }

    }
}
