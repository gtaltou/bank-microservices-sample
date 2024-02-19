package com.taltou.bankaccountservice.repository;

import com.taltou.bankaccountservice.entities.BankAccount;
import com.taltou.bankaccountservice.enums.AccountStatus;
import com.taltou.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    List<BankAccount> findByType(AccountType type);
    List<BankAccount> findByStatus(AccountStatus status);
    @Query("select " +
            "new com.taltou.bankaccountservice.repository.AccountStats(" +
            "count(ba)," +
            "sum(ba.balance), " +
            "avg(ba.balance), " +
            "min(ba.balance), " +
            "max(ba.balance)) from BankAccount ba")
    AccountStats getBankStats();
}
