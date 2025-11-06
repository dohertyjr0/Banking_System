package atu.ie.bankservice;

import atu.ie.bankservice.account.Account;
import atu.ie.bankservice.account.AccountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {
    @Test
    void createThenLoginSuccess() {
        AccountService service = new AccountService();

        Account acc = Account.builder()
                .Account_Name("john")
                .Passcode("1234")
                .Account_Number(1)
                .Balance(0)
                .build();

        service.getAllAccounts().add(acc);

        String result = service.login("john", "1234");
        assertEquals("login success, john", result);
    }

}
