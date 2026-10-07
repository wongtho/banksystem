package com.jarvis.g2.banksystem.dto;

import java.time.LocalDateTime;

import com.jarvis.g2.banksystem.enums.TransactionChannel;
import com.jarvis.g2.banksystem.enums.TransactionType;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class Transaction {
    private String transactionId;
    private LocalDateTime timestamp;
    private TransactionType accountType;
    private String fromAccount;
    private String toAccount;
    private Integer amount;
    private TransactionChannel channel;
    private String description;
}
