package atu.ie.bankservice.account;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account")
@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String AccountName;
    private int AccountNumber;
    private double Balance;

    public Account(String accountName, int accountNumber, double balance) {
        AccountName = accountName;
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }


}
