public class Main {
    public static void main(String[] args) {
        User user = new User();
        // создание пользователей
        User user1 = user.createUser("Карина");
        User user2 = user.createUser("Алина");
        User user3 = user.createUser("Арбуз");
        User user4 = user.createUser("Лосось2007");
        User[] allUsers = user.getUsers();
        // Создание группы и канала
        Group group1 = new Group("АААА", user2);
        group1.addMember(user3);
        Channel channel1 = new Channel("ББББ", user4);
        channel1.addSub(user1);

        // Отправка сообщений
        SendMessage sendMessage = new SendMessage();
        sendMessage.sendMessage(user2, user1, "Как дела с домашкой?", "20:30");
        sendMessage.sendMessage(user1, user2, "Почти доделала", "21:00");
        sendMessage.sendMessage(user3, user4, "Картошка", "10:10");
        sendMessage.sendMessage(user3, group1, "Хочу спать", "8:30");
        sendMessage.sendMessage(user1, group1, "Я тоже хочу в группу!", "8:30");
        sendMessage.sendMessage(user4, channel1, "ВВВВ", "00:00");

        // Вывод пользователей
        System.out.print("Пользователи: ");
        for (int i = 0; i < allUsers.length; ++i) {
            if (allUsers[i] != null) {
                System.out.print(allUsers[i].getName() + "; ");
            } else {
                break;
            }
        }
        System.out.println();
        // Вывод всех сообщений
        System.out.println("Все сообщения:");
        Message[] history = sendMessage.getHistoryMessage();
        for (int i = 0; i < history.length; ++i) {
            if (history[i] != null) {
                System.out.println(history[i].toString());
            }
        }
    }
}