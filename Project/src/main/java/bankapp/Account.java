package bankapp;

public class Account {
    private String accountUser;

    private double balance;
    private int id;
    public Account(String accountUser, double initialBalance, int num) {
        if (initialBalance >= 1) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
        if (num > 0) {
            this.id = num;
        } else {
            this.id = (int)(Math.random() * (1000 + 1));
        }

        this.accountUser = accountUser;
    }

    public void sendMoney(double money) {
        if (money > this.balance) {
            throw new InsufficientMoney("Not enough money for extraction");
        }
        if (money <= 0) {
            throw new InvalidMoney("Invalid quantity");
        }
        this.balance -= money;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            throw new InvalidMoney("Invalid quantity");
        }
        this.balance += money;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(String accountUser) {
        this.accountUser = accountUser;
    }
}
