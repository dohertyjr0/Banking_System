package atu.ie.bankservice.account;
import com.fasterxml.jackson.core.sym.Name;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/accountlist")
public class AccountController {
   private final AccountService accountService;

   public AccountController(AccountService accountService) {
       this.accountService = accountService;
   }
   @GetMapping
    public List<Account> getAccountlist(){
      return accountService.findAll();
   }
   @PostMapping("AddAccount")
    public Account create(@RequestBody Account account){
       return accountService.create(account);
   }
   @DeleteMapping("DeleteAccount")
    public void delete(@RequestBody Account account){
         accountService.delete(account);
   }
    @PutMapping("updateAccount")
    public Account update(@Valid @RequestBody Account account) {
        return accountService.update(account);

    }

}
