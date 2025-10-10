package atu.ie.bankservice;

public class Payment {
    private final String id;
    private final double amount;
    public final String tx;
    public  final String rx;

    public Payment(String id, double amount, String tx, String rx) {
        this.id = id;
        this.amount = amount;
        this.tx = tx;
        this.rx = rx;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getTx() {
        return tx;
    }

    public String getRx() {
        return rx;
    }
}
