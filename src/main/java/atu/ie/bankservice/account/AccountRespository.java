package atu.ie.bankservice.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRespository extends JpaRepository<Account,Long> {
    Optional<Account> findById(Long id);
}
