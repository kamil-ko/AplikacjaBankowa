package pl.k.kamil.logic;

import pl.k.kamil.model.Account;
import pl.k.kamil.model.User;

import java.util.Scanner;

public class Engine {

    private User[] users = new User[10];

    public void start() {
        System.out.println("Witamy w banku. Podaj swój login");
        Scanner scanner = new Scanner(System.in);
        NumberGenerator generator = new NumberGenerator(users);
        String login = scanner.next();
        User checkUser = null;
        for (User user : users) {
            if (user != null && login.equalsIgnoreCase(user.getLogin())) {
                checkUser = user;
                break;

            }
        }

        if (checkUser == null) {
            System.out.println("Konto zostało utworzone");
            User newUser = new User();
            newUser.setLogin(login);
            Account newAccount = new Account();
            newAccount.setNumber(generator.generateNumber());
            newAccount.setSumOfMoney(0d);
            newUser.setAccount(newAccount);
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null){
                    users[i] = newUser;
                    break;
                }

            }

        }

    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);

        }
    }
}
