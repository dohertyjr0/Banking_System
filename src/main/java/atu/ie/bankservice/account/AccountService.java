package atu.ie.bankservice.account;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private final List<Account> accountlist;
    public AccountService() {
        accountlist = new ArrayList<>();
        accountlist.add(new Account("m", 324223,2102,"p"));
    }

    public List<Account> getAllAccounts() {
        return accountlist;
    }

    public String login(String name, String passcode) {
        for (Account account : accountlist) {
            if (account.getAccount_Name().equals(name) && account.getPasscode().equals(passcode)) {
                return "login success, " + account.getAccount_Name();
            }
        }
        return "login failed";
    }
    public String addAccount(String name, String passcode) {
        for (Account account : accountlist) {
            if (account.getAccount_Name().equals(name) && account.getPasscode().equals(passcode)) {
                return "account already exists, " + account.getAccount_Name();
            }
        }
        accountlist.add(new Account(name, passcode));
        return "add account success";
    }
    public String deleteAccount(String name, String passcode) {
        for (Account account : accountlist) {
            if (account.getAccount_Name().equals(name) && account.getPasscode().equals(passcode)) {
                accountlist.remove(account);
                return "deleting : " + account.getAccount_Name();
            }
        }
        return "invalid credentials";
    }
    public String updateAccount(int accountNumber, String name, String passcode) {
        for (Account account : accountlist) {
            if (account.getAccount_Number() == accountNumber) {
                account.setAccount_Name(name);
                account.setPasscode(passcode);
                return "update success";
            }
        }
        return "invalid credentials";
    }
}
