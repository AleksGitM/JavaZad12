package pl.akademia108;

public class User {
    private int id;
    private String username;
    private String password;
    private boolean isLogged;
    private String description;

    public User(int id, String username, String password) {
        this.username = username;
        this.password = password;
        this.isLogged = false;
        this.description = "-";
    }

    public User(int id, String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.isLogged = false;
        this.description = description;
    }

    public void login(String username, String password) {
        if (this.username == username && this.password == password) {
            System.out.println("Zalogowano");
            this.isLogged = true;
        } else {
            System.out.println("Nie udało się zalogować");
            this.isLogged = false;
        }
    }

    public String printInfo() {
        String returnString = "";

        if (this.isLogged) {
            returnString = "Użytkownik " + this.username + " jest zalogowany. Jego opis to " + this.description;
        } else {
            returnString = "Użytkownik " + this.username + " nie jest zalogowany. Jego opis to " + this.description;
        }
        return returnString;
    }

    public void logout() {
        this.isLogged = false;
        System.out.println("Wylogowano");
    }
}
