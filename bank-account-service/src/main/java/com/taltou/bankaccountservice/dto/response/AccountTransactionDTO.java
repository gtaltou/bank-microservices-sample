package com.taltou.bankaccountservice.dto.response;

import com.taltou.bankaccountservice.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AccountTransactionDTO {
    private Long id;
    private String description;
    private Date date;
    private TransactionType type;
    private double amount;
    private String accountId;
}
