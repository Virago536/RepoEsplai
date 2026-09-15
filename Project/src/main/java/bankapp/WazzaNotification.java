package bankapp;

public class WazzaNotification implements Notification{
    @Override
    public void notifyTrans() {
        IO.println("Transaction notified by whatsapp");
    }
}
