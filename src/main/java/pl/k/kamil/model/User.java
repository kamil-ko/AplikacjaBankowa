package pl.k.kamil.model;

public class User {

    private String login;
    private Account account;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", account=" + account +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
