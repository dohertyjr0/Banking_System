package atu.ie.bankservice;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Account {
    private String Account_Name;
    private double Account_Number;
    private double Balance;
    private String Passcode;
}
