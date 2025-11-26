public class Group {
    private String name;
    private User admin;
    private User[] members = new User[100];
    private int countMembers = 0;
    private User userGroup;

    public Group(String name, User admin) {
        this.name = name;
        this.admin = admin;
        this.members[0] = admin;
        countMembers++;
        userGroup = new User(name);
    }

    public boolean containsMember(User suchUser) {
        for (int i = 0; i < members.length; ++i) {
            if (members[i] == suchUser) {
                return true;
            }
        }
        return false;
    }
    public void addMember(User user) {
        if (!containsMember(user)) {
            members[countMembers++] = user;
            System.out.println("Пользователь " + user.getName() + " добавлен в группу '" + name + "'");
        }
    }

    public void removeMember(User user) {
        if (containsMember(user) && (user != admin)) {
            members[countMembers--] = null;
            System.out.println("Пользователь " + user.getName() + " удален из группы '" + name + "'");
        }
    }

    public String getName() { return name; }
    public User getUser () { return userGroup; }


}