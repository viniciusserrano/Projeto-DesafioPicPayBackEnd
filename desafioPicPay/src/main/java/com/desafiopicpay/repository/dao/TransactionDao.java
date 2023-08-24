package com.desafiopicpay.repository.dao;

import com.desafiopicpay.repository.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction, Long> {
}
