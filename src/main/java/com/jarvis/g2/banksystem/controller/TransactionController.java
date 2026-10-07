package com.jarvis.g2.banksystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {
    @GetMapping("/transaction")
    public String loadController() {
        return "Transaction controller is working!";
    }


    @PostMapping("/transactions/{id}")
    public ResponseEntity<String> createTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        // Logic to create a transaction for the account with the given ID
        return ResponseEntity.ok("Transaction created successfully for account ID: " + id);
    }
}
