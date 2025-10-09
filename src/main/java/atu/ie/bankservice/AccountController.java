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
        accountlist.add(new  Account("joe jon",256172,699.08,"pass"));
        accountlist.add(new Account("billy bob",890234,4000.00,"word"));
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
}
