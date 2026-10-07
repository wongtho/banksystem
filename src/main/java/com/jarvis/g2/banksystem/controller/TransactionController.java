package com.jarvis.g2.banksystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.g2.banksystem.dto.TransactionDTO;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @GetMapping("/transaction")
    public String loadController() {
        return "Transaction controller is working!";
    }

    @PostMapping("/transaction/{id}")
    public ResponseEntity<String> createTransaction(@PathVariable String id, @RequestBody TransactionDTO transaction) {
        // Logic to create a transaction for the account with the given ID
        System.out.println(transaction.timestamp.toString());
        System.out.println(transaction.accountType.toString());
        System.out.println(transaction.fromAccount.toString());
        System.out.println(transaction.toAccount.toString());
        System.out.println(transaction.amount.toString());
        System.out.println(transaction.channel.toString());
        System.out.println(transaction.description.toString());
        return ResponseEntity.ok("Transaction created successfully for account ID: " + id);
    }
}
