package bankapp;

public class UnknownAccount extends RuntimeException {
    public UnknownAccount(String message) {
        super(message);
    }
}
