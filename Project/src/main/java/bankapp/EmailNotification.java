package bankapp;

public class EmailNotification implements Notification{

    @Override
    public void notifyTrans() {
        IO.println("Transaction notified by email");
    }
}
