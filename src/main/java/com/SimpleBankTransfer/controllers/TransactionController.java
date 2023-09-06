package com.SimpleBankTransfer.controllers;

import com.SimpleBankTransfer.domain.transaction.Transaction;
import com.SimpleBankTransfer.dtos.TransactionDTO;
import com.SimpleBankTransfer.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transacation) throws Exception{
        Transaction newTransaction = this.transactionService.createTransaction(transacation);
        return new ResponseEntity<>(newTransaction, HttpStatus.OK);
    }
}
