package atu.ie.bankservice.account;
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
        this.Account_Name = accountlist.get(0).getAccount_Name();
    }

    public Account(String passcode, String name) {
        this.Account_Name = name;
        this.Passcode = passcode;
       this.Account_Number = 0;
       this.Balance = 0;
    }
}
