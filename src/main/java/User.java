public class User {
    private String name;
    private int ID = 0;
    private User[] users = new User[100];

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = "default";
    }


    public String getName() { return name; }
    public int getID() { return ID; };

    public User createUser(String name) {
        User user = new User(name);
        user.ID = ID;
        users[ID] = user;
        ID ++;
        return user;
    }

    public User[] getUsers() { return users; }
}
