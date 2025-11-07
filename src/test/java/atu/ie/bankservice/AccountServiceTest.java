package atu.ie.bankservice;

import atu.ie.bankservice.account.Account;
import atu.ie.bankservice.account.AccountService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {
    @Test
    void createThenUpdateSuccess() {
        List<Account> accounts = new ArrayList<>();
        Account acc = Account.builder()
                .AccountName("jo")
                .AccountNumber(1707)
                .Balance(0)
                .build();
        accounts.add(acc);

        accounts.get(0).setBalance(500.0);
        assertEquals(500.0, accounts.get(0).getBalance());
        assertEquals("jo", accounts.get(0).getAccountName());
        assertEquals(1707, accounts.get(0).getAccountNumber());
    }
}
