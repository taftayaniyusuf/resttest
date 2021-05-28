package com.taftayani.resttest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taftayani.resttest.model.Transaction;
import com.taftayani.resttest.repository.TransactionRepository;

@RestController
@RequestMapping("/transactionservice")
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;

	@PutMapping("/transaction/{transaction_id}")
	public Map<String, String> updateEmployee(@PathVariable(value = "transaction_id") Long transaction_id,
			@RequestBody Transaction transactionDetails) {
		Transaction transaction = new Transaction(transaction_id, transactionDetails.getAmount(),
				transactionDetails.getType(), transactionDetails.getParent_id());
		transactionRepository.save(transaction);
		Map<String, String> response = new HashMap<>();
		response.put("status", "OK");
		return response;

	}
}
