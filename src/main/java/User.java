public class User {
    private String name;
    private int ID = 0;
    private User[] users = new User[100];
    private int cnt = 0;

    public User(String name) {
        this.name = name;
        this.ID = ID;
    }


    public String getName() { return name; }
    public int getID() { return ID; };

    public void createUser(String name) {
        User user = new User(name);
        users[ID] = user;
        ID ++;
    }

}
