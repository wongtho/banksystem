package com.jarvis.g2.banksystem.dto;

import java.time.LocalDateTime;

import com.jarvis.g2.banksystem.enums.TransactionType;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class Transaction {
    private String transactionId;
    private LocalDateTime timestamp;
    private TransactionType accountType;
}
