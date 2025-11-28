package atu.ie.bankservice;

import atu.ie.bankservice.ledger.LedgerEntry;
import atu.ie.bankservice.ledger.LedgerRepository;
import atu.ie.bankservice.ledger.LedgerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class LedgerServiceTest {

    @Autowired
    private LedgerService ledgerService;

    @Autowired
    private LedgerRepository ledgerRepository;

    @Test
    void record_createsAndPersistsEntry() {

        ledgerRepository.deleteAll();

        LedgerEntry saved = ledgerService.record(
                "TRANSFER",
                100.0,
                "ACC-1",
                "ACC-2",
                "Unit test transfer"
        );

        assertNotNull(saved.getId());
        assertEquals(100.0, saved.getAmount());
        assertEquals("ACC-1", saved.getFromAccount());

        List<LedgerEntry> all = ledgerService.getAll();
        assertEquals(1, all.size());
        assertEquals("ACC-2", all.get(0).getToAccount());
    }

    @Test
    void getForAccount_returnsEntriesForEitherSide() {
        ledgerRepository.deleteAll();

        ledgerService.record("TRANSFER", 50.0, "A1", "A2", "first");
        ledgerService.record("TRANSFER", 75.0, "A3", "A1", "second");

        List<LedgerEntry> forA1 = ledgerService.getForAccount("A1");

        assertEquals(2, forA1.size());
    }
}

