package atu.ie.bankservice.ledger;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LedgerService {

    private final LedgerRepository ledgerRepository;

    public LedgerService(LedgerRepository ledgerRepository) {
        this.ledgerRepository = ledgerRepository;
    }

    public LedgerEntry record(
            String type,
            double amount,
            String fromAccount,
            String toAccount,
            String description
    ) {
        LedgerEntry entry = LedgerEntry.builder()
                .timestamp(LocalDateTime.now())
                .type(type)
                .amount(amount)
                .fromAccount(fromAccount)
                .toAccount(toAccount)
                .description(description)
                .build();

        return ledgerRepository.save(entry);
    }

    public List<LedgerEntry> getAll() {
        return ledgerRepository.findAll();
    }

    public List<LedgerEntry> getForAccount(String accountNumber) {
        return ledgerRepository.findByFromAccountOrToAccount(accountNumber, accountNumber);
    }
}
