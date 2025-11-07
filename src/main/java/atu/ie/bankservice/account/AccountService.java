package atu.ie.bankservice.account;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository  Repo;

    public AccountService(AccountRepository Repo) {
        this.Repo = Repo;
    }
    public Account findById(Long id) {
        return Repo.findById(id).orElse(null);
    }
    public Account create(Account account){
        return Repo.save(account);
    }
    public Account update(Account account){
        return Repo.save(account);
    }
    public void delete(Long id){
        Repo.deleteById(id);
    }
    public List<Account> findAll(){
        return Repo.findAll();
    }

}
