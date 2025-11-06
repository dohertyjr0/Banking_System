package atu.ie.bankservice.account;
import com.fasterxml.jackson.core.sym.Name;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/accountlist")
public class AccountController {
   private final AccountService accountService;

   public AccountController(){
       this.accountService = new AccountService();
   }
   @GetMapping
    public List<Account> getAccountlist(){
      return accountService.getAllAccounts();
   }
   @PostMapping("Login")
    public String login(@RequestParam String name, @RequestParam String passcode){
       return accountService.login(name, passcode);
   }
   @PostMapping("AddAccount")
    public String addAccount(@RequestParam String name, @RequestParam String passcode){
       return accountService.addAccount(name, passcode);
   }
   @DeleteMapping("DeleteAccount")
    public String deleteAccount(@RequestParam String name, @RequestParam String passcode){
       return accountService.deleteAccount(name, passcode);
   }
   @PutMapping("UpdateAccount")
    public String updateAccount(@RequestParam int accountNumber,@RequestParam String name, @RequestParam String passcode){
       return accountService.updateAccount(accountNumber,name, passcode);
   }

}
