package atu.ie.bankservice;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Account {
    private String Account_Name;
    private double Account_Number;
    private double Balance;
    private String Passcode;

    public Account(List<Account> accountlist) {
    }

    public Account(String passcode, String name) {

        this.Passcode = passcode;
        this.Account_Name = name;
    }
}
