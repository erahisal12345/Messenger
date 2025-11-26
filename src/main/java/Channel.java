public class Channel {
    private String name;
    private User admin;
    private User[] subs = new User[100];
    private int subsCount;
    private User userChannel;

    public Channel(String name, User admin) {
        this.name = name;
        this.admin = admin;
        this.subs[0] = admin;
        subsCount++;
        userChannel = new User(name);
    }
    public boolean containsMember(User suchUser) {
        for (int i = 0; i < subs.length; ++i) {
            if (subs[i] == suchUser) {
                return true;
            }
        }
        return false;
    }
    public void addSub(User user) {
        if (!containsMember(user)) {
            subs[subsCount++] = user;
            System.out.println("Пользователь " + user.getName() + "подписался на канал" + name);
        }
    }
    public String getName() { return name; }
    public User getAdmin() {
        return admin;
    }
    public User getUser () { return userChannel; }
}
