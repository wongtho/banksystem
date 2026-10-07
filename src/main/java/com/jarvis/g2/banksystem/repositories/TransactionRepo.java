package com.jarvis.g2.banksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.g2.banksystem.entities.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, String> {

}
