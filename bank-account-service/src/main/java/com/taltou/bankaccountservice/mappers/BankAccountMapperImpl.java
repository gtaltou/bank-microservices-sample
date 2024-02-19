package com.taltou.bankaccountservice.mappers;

import com.taltou.bankaccountservice.dto.response.AccountTransactionDTO;
import com.taltou.bankaccountservice.dto.response.BankAccountDTO;
import com.taltou.bankaccountservice.entities.AccountTransaction;
import com.taltou.bankaccountservice.entities.BankAccount;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BankAccountMapperImpl implements BankAccountMapper {
    private ModelMapper modelMapper;
    @PostConstruct
    public  void init(){
        modelMapper=new ModelMapper();
    }
    @Override
    public BankAccount from(BankAccountDTO bankAccountDTO) {
       return modelMapper.map(bankAccountDTO,BankAccount.class);
    }

    @Override
    public BankAccountDTO from(BankAccount bankAccount) {
        BankAccountDTO bankAccountDTO = modelMapper.map(bankAccount, BankAccountDTO.class);
        return bankAccountDTO;
    }

    @Override
    public AccountTransactionDTO from(AccountTransaction transaction) {
        return modelMapper.map(transaction,AccountTransactionDTO.class);
    }
}
