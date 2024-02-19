package com.taltou.bankaccountservice.web;

import com.taltou.bankaccountservice.dto.request.*;
import com.taltou.bankaccountservice.dto.response.AccountDetailsDTO;
import com.taltou.bankaccountservice.dto.response.BankAccountDTO;
import com.taltou.bankaccountservice.dto.response.GetBankStatsResponseDTO;
import com.taltou.bankaccountservice.dto.response.TransferResponseDTO;
import com.taltou.bankaccountservice.enums.AccountStatus;
import com.taltou.bankaccountservice.exception.*;
import com.taltou.bankaccountservice.service.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
public class BankGraphQLController {
    private BankAccountService bankAccountService;

    @QueryMapping
    public List<BankAccountDTO> allAccounts(){
        return bankAccountService.getAllBankAccounts();
    }
    @QueryMapping
    public BankAccountDTO accountById(@Argument String id) throws BankAccountNotFoundException {
        return bankAccountService.getBankAccountById(id);
    }

    @QueryMapping
    public List<BankAccountDTO> accountsByStatus(@Argument AccountStatus status){
        return bankAccountService.getAccountsByStatus(status);
    }

    @QueryMapping
    public GetBankStatsResponseDTO getBankStats(){
        return bankAccountService.getBankStats();
    }
    @QueryMapping
    public AccountDetailsDTO accountDetails(@Argument String accountId) throws BankAccountNotFoundException {
        return bankAccountService.accountDetails(accountId);
    }

    @MutationMapping
    public BankAccountDTO saveNewAccount(@Argument SaveNewAccountRequestDTO request) throws AmountRejectedException, RemoteCustomerNotFoundException {
            BankAccountDTO account = bankAccountService.saveNewAccount(request);
            return account;
    }
    @MutationMapping
    public BankAccountDTO debitAccount(@Argument DebitAccountRequestDTO request) throws AmountRejectedException, BankAccountNotFoundException, BalanceNotSufficientException {
            BankAccountDTO account = bankAccountService.debitAccount(request);
            return account;
    }
    @MutationMapping
    public BankAccountDTO creditAccount(@Argument CreditAccountRequestDTO request) throws AmountRejectedException, BankAccountNotFoundException, BalanceNotSufficientException {
            BankAccountDTO account = bankAccountService.creditAccount(request);
           return account;
    }
    @MutationMapping
    public TransferResponseDTO transfer(@Argument TransferRequestDTO request) throws AmountRejectedException, TransferRejectedException, BankAccountNotFoundException, BalanceNotSufficientException {
            TransferResponseDTO transfer = bankAccountService.transfer(request);
           return transfer;
    }
    @MutationMapping
    public BankAccountDTO changeAccountStatus(@Argument ChangeAccountStatusRequestDTO request) throws BankAccountNotFoundException {
            BankAccountDTO bankAccountDTO = bankAccountService.changeStatusTo(request);
            return bankAccountDTO;
    }
}
