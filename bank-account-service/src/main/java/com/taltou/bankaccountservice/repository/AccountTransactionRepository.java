package com.taltou.bankaccountservice.repository;



import com.taltou.bankaccountservice.entities.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction,Long> {
   List<AccountTransaction> findByBankAccountId(String accountId);
}
