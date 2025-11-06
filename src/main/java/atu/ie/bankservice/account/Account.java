package atu.ie.bankservice.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class Account {
    private String Account_Name;
    private double Account_Number;
    private double Balance;
    private String Passcode;


    public Account(String passcode, String name) {
        this.Account_Name = name;
        this.Passcode = passcode;
       this.Account_Number = 0;
       this.Balance = 0;
    }
}
