package com.taltou.bankaccountservice.dto.request;


import com.taltou.bankaccountservice.enums.AccountStatus;

public record ChangeAccountStatusRequestDTO(
        String accountId, AccountStatus status
){
}
