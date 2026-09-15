package bankapp;

public class InsufficientMoney extends RuntimeException {
    public InsufficientMoney(String message) {
        super(message);
    }
}
