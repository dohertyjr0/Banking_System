package atu.ie.bankservice;

public class Payment {
    private String id;
    private double amount;
    private String tx;
    private String rx;

    public Payment(){}

    public Payment(String id, double amount, String tx, String rx) {
        this.id = id;
        this.amount = amount;
        this.tx = tx;
        this.rx = rx;
    }

    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTx() {
        return tx;
    }
    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getRx() {
        return rx;
    }
    public void setRx(String rx) {
        this.rx = rx;
    }
}
