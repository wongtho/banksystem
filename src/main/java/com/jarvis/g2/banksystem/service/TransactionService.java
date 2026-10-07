package com.jarvis.g2.banksystem.service;

import java.util.List;

import com.jarvis.g2.banksystem.entities.Transaction;

public interface TransactionService {
    public List<Transaction> getAllTransactions();
    public Transaction getTransactionById(String id);
    public String addTransaction(Transaction transaction);
}
