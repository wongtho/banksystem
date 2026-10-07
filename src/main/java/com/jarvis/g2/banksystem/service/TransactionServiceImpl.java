package com.jarvis.g2.banksystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jarvis.g2.banksystem.entities.Transaction;
import com.jarvis.g2.banksystem.repositories.TransactionRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor 
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepo transactionRepo;
    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }
    @Override
    public Transaction getTransactionById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
    }
    @Override
    public String addTransaction(Transaction transaction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
    }
}
