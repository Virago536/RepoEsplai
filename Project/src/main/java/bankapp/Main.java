import bankapp.*;
import poo.InvalidData;

import java.util.ArrayList;
import java.util.Scanner;


void main() {
    Scanner sc = new Scanner(System.in);
    boolean menu = true;
    ArrayList<Account> accountList = new ArrayList<>();

    Notification sms = new SMSNotification();
    Notification email = new EmailNotification();
    Notification whatsapp = new WazzaNotification();

    accountList.add(new Account("Alejandro", 50.0, 123));
    accountList.add(new Account("Alvaro", 25.0, 124));
    while (menu) {
        try {
            System.out.println("""
                    Esplai Bank
                    -----------
                    1. Create Account
                    2. Generate transaction
                    3. Exit
                    -----------
                    """);
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Introduce your name: ");
                    String name = sc.next();
                    System.out.print("introduce initial balance (optional): ");
                    double initialBalance = sc.nextDouble();
                    boolean creation = true;
                    Account acc = new Account(name, initialBalance, 0);
                    while (creation) {
                        creation = checkId(acc.getId(), accountList);
                        if (creation)
                            acc = new Account(name, initialBalance, 0);
                    }
                    accountList.add(acc);
                    System.out.println("Account created successfully");
                    System.out.println("---Name: " + acc.getAccountUser());
                    System.out.println("---Account number: " + acc.getId());
                    System.out.println("---Balance: " + acc.getBalance());
                    break;
                case 2:
                    System.out.print("Introduce your number account: ");
                    int accNum = sc.nextInt();
                    Account currentAcc = findAccount(accNum, accountList);
                    boolean transLoop = true;
                    while (transLoop) {
                        System.out.println("""
                                    Select transaction
                                    -----------
                                    1. Send money
                                    2. Deposit money
                                    3. Exit
                                    -----------
                                """);
                        int op2 = sc.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.print("Introduce the account to send money: ");
                                int destNum = sc.nextInt();
                                Account destAcc = findAccount(destNum, accountList);
                                if (currentAcc.getId() == destAcc.getId())
                                    throw new InvalidData("you cannot send money to yourself, you bugger");
                                System.out.print("Introduce the money sent: ");
                                double quantitySent = sc.nextDouble();
                                Cashier cashier = new Cashier();
                                System.out.println("""
                                    Select the way you want to be notified
                                    -----------
                                    1. Email
                                    2. SMS
                                    3. Whatsapp
                                    -----------
                                """);
                                int opNot = sc.nextInt();
                                Notification not = null;
                                switch(opNot) {
                                    case 1:
                                        not = email;
                                        break;
                                    case 2:
                                        not = sms;
                                        break;
                                    case 3:
                                        not = whatsapp;
                                        break;
                                    default:
                                        throw new InvalidData("Invalid notification option");

                                }
                                cashier.tranfer(currentAcc, destAcc, quantitySent, not);
                                System.out.println("Transaction completed");
                                System.out.println("---Current account: " + currentAcc.getBalance() + "€");
                                System.out.println("---destiny account: " + destAcc.getBalance() + "€");
                                break;
                            case 2:
                                System.out.print("Introduce the money deposited: ");
                                double quantity = sc.nextDouble();
                                currentAcc.depositMoney(quantity);
                                break;
                            case 3:
                                transLoop = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bye");
                    menu = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public static boolean checkId(int newId, ArrayList<Account> accList) {
    for (Account account:accList) {
        if (newId == account.getId()) {
            return true;
        }
    }
    return false;
}

public static boolean checkTrans(int num, ArrayList<Account> accList) {
    for (Account account:accList) {
        if (num == account.getId()) {
            return true;
        }
    }
    return false;
}

public static Account findAccount(int id, ArrayList<Account> accList) {
    for (Account acc: accList) {
        if (acc.getId() == id) {
            return acc;
        }
    }
    throw new UnknownAccount("Account doesn´t exists");
}