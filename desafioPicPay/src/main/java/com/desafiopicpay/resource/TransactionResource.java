package com.desafiopicpay.resource;

import com.desafiopicpay.repository.dto.TransactionDto;
import com.desafiopicpay.repository.entity.Transaction;
import com.desafiopicpay.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/transactions")
public class TransactionResource {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDto transactionDto) throws Exception {
        Transaction newTransaction = this.transactionService.createTransaction(transactionDto);
        return new ResponseEntity<>(newTransaction, HttpStatus.OK);
    }
}
