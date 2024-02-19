package com.taltou.bankaccountservice.service;

import com.taltou.bankaccountservice.dto.request.*;
import com.taltou.bankaccountservice.dto.response.AccountDetailsDTO;
import com.taltou.bankaccountservice.dto.response.BankAccountDTO;
import com.taltou.bankaccountservice.dto.response.GetBankStatsResponseDTO;
import com.taltou.bankaccountservice.dto.response.TransferResponseDTO;
import com.taltou.bankaccountservice.enums.AccountStatus;
import com.taltou.bankaccountservice.enums.AccountType;
import com.taltou.bankaccountservice.exception.*;

import java.util.List;

public interface BankAccountService {
    BankAccountDTO saveNewAccount(SaveNewAccountRequestDTO requestDTO) throws AmountRejectedException, RemoteCustomerNotFoundException;

    List<BankAccountDTO> getAllBankAccounts();
    List<BankAccountDTO> getAccountsByType(AccountType type);
    List<BankAccountDTO> getAccountsByStatus(AccountStatus status);

    BankAccountDTO getBankAccountById(String accountId) throws BankAccountNotFoundException;

    BankAccountDTO debitAccount(DebitAccountRequestDTO debitAccountRequest) throws BankAccountNotFoundException, BalanceNotSufficientException, AmountRejectedException;

    BankAccountDTO creditAccount(CreditAccountRequestDTO creditAccountRequest) throws BankAccountNotFoundException, BalanceNotSufficientException, AmountRejectedException;

    TransferResponseDTO transfer(TransferRequestDTO transferRequestDTO) throws BankAccountNotFoundException, BalanceNotSufficientException, AmountRejectedException, TransferRejectedException, TransferRejectedException;

    BankAccountDTO changeStatusTo(ChangeAccountStatusRequestDTO changeAccountStatusRequest) throws BankAccountNotFoundException;

    GetBankStatsResponseDTO getBankStats();
    AccountDetailsDTO accountDetails(String accountId) throws BankAccountNotFoundException;
}