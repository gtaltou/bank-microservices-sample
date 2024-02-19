package com.taltou.bankaccountservice.mappers;


import com.taltou.bankaccountservice.dto.response.AccountTransactionDTO;
import com.taltou.bankaccountservice.dto.response.BankAccountDTO;
import com.taltou.bankaccountservice.entities.AccountTransaction;
import com.taltou.bankaccountservice.entities.BankAccount;

public interface BankAccountMapper {
    BankAccount from(BankAccountDTO bankAccountDTO);
    BankAccountDTO from(BankAccount bankAccount);
    AccountTransactionDTO from(AccountTransaction transaction);
}
