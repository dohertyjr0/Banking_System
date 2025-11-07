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
