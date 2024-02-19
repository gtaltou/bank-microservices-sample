package com.taltou.bankaccountservice.dto.response;

public record TransferResponseDTO(
        String message,
        String accountIdSource,
        String accountIdDestination,
        double amount
){
}
