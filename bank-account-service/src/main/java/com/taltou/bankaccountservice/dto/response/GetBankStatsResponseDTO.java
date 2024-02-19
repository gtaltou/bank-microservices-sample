package com.taltou.bankaccountservice.dto.response;

public record GetBankStatsResponseDTO(
    Double totalBalance,
    Long numberOfAccounts,
    Double avgBalance,
    Double minBalance,
    Double maxBalance
){}
