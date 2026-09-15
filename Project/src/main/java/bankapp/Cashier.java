package bankapp;

public class Cashier {
    public void tranfer(Account acc1, Account acc2, double amount, Notification notification) {
        try {
            acc1.sendMoney(amount);
            acc2.depositMoney(amount);
            notification.notifyTrans();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
