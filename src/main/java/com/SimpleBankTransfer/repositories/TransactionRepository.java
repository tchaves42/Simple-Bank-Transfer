package com.SimpleBankTransfer.repositories;

import com.SimpleBankTransfer.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
