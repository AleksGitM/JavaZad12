package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        User user = new User(2123, "aleks", "ipsum");

        user.login("aleks", "ipsum");
        user.logout();

        User user2 = new User(3214, "hans", "1512", "lorem ipsum");
        user2.login("hans", "1512");
        user2.logout();

        System.out.println(user2.printInfo());
    }
}
