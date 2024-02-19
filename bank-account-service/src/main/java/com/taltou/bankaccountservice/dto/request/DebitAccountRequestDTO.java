package com.taltou.bankaccountservice.dto.request;

public record DebitAccountRequestDTO(
        String accountId, double amount
){
}
