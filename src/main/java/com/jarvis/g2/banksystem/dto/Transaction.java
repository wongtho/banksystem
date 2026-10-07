package com.jarvis.g2.banksystem.dto;

import java.time.LocalDateTime;

import com.jarvis.g2.banksystem.enums.TransactionChannel;
import com.jarvis.g2.banksystem.enums.TransactionType;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class Transaction {
    public String transactionId;
    public LocalDateTime timestamp;
    public TransactionType accountType;
    public String fromAccount;
    public String toAccount;
    public Double amount;
    public TransactionChannel channel;
    public String description;
}
