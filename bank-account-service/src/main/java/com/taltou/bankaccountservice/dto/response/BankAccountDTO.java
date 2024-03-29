package com.taltou.bankaccountservice.dto.response;

import com.taltou.bankaccountservice.enums.AccountStatus;
import com.taltou.bankaccountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountDTO {
    private String id;
    private String currency;
    private Date createdAt;
    private double balance;
    private AccountType type;
    private AccountStatus status;
    private Long customerId;
    private List<AccountTransactionDTO> transactions;
}
