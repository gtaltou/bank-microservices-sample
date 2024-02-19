package com.taltou.bankaccountservice.dto.request;


import com.taltou.bankaccountservice.enums.AccountType;

public record SaveNewAccountRequestDTO (
    String id,
    double initialBalance,
    String currency,
    AccountType type,
    Long customerId
){
}
