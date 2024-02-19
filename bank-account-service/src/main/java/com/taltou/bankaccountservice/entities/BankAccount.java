package com.taltou.bankaccountservice.entities;

import com.taltou.bankaccountservice.enums.AccountStatus;
import com.taltou.bankaccountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private String currency;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private double balance;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private Long customerId;
}
