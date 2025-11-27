package atu.ie.bankservice;

import atu.ie.bankservice.account.Account;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {

    @Test
    void createTwoAccounts_listContainsBoth() {
        // Arrange
        List<Account> accounts = new ArrayList<>();

        Account acc1 = Account.builder()
                .AccountName("alice")
                .AccountNumber(1001)
                .Balance(50.0)
                .build();

        Account acc2 = Account.builder()
                .AccountName("bob")
                .AccountNumber(1002)
                .Balance(75.0)
                .build();

        // Act
        accounts.add(acc1);
        accounts.add(acc2);

        // Assert
        assertEquals(2, accounts.size());
        assertEquals("alice", accounts.get(0).getAccountName());
        assertEquals("bob",   accounts.get(1).getAccountName());
    }

    @Test
    void builderSetsFieldsCorrectly() {
        // Act
        Account acc = Account.builder()
                .AccountName("test-user")
                .AccountNumber(9999)
                .Balance(123.45)
                .build();

        // Assert
        assertEquals("test-user", acc.getAccountName());
        assertEquals(9999,        acc.getAccountNumber());
        assertEquals(123.45,      acc.getBalance());
    }
}

