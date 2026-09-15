package bankapp;

public class SMSNotification implements Notification{

    @Override
    public void notifyTrans() {
        IO.println("Transaction notified by SMS");
    }
}
