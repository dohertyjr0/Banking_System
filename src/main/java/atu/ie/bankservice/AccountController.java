package atu.ie.bankservice;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/accountlist")
public class AccountController {
    private final List<Account> accountlist;
    public AccountController(){
        accountlist = new ArrayList<>();
        accountlist.add(new  Account("joe jon", "pass"));
        accountlist.add(new Account("billy bob", "word"));
    }
    @GetMapping
    public List<Account> getAccountlist(){
        return accountlist;
    }

    @PostMapping("/login")
    public String login(@RequestParam String passcode,@RequestParam String name){
        for(Account account : accountlist){
            if(account.getPasscode().equals(passcode) && account.getAccount_Name().equals(name))
            {
                    return "login success, "+account.getAccount_Name();
            }
        }
        return "login failed";
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestParam String name,@RequestParam String passcode){
        for(Account account : accountlist){
            if(account.getPasscode().equals(passcode) && account.getAccount_Name().equals(name))
            {
                return "account already exists, "+account.getAccount_Name();

            }
        }
        accountlist.add(new Account(passcode,name));
        return "add account success";

    }

    @DeleteMapping("/DeleteAccount")
    public String deleteAccount(@RequestParam String name,@RequestParam String passcode){
        for(Account account : accountlist){
            if(account.getPasscode().equals(passcode) && account.getAccount_Name().equals(name))
            {
                accountlist.remove(account);
                return "deleting : "+account.getAccount_Name();

            }
        }
        return "invalid credentials";

    }
}
