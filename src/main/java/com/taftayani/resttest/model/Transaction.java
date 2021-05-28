package com.taftayani.resttest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	@javax.persistence.Id
	private Long transaction_id;
	@Column(name = "amount")
	private double amount;
	@Column(name = "type")
	private String type;
	@Column(name = "parent_id")
	private long parent_id;
	
	
	public Transaction() {
		super();
		
	}
	public Transaction(long transaction_id, double amount, String type, long parent_id) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.type = type;
		this.parent_id = parent_id;
	}
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getParent_id() {
		return parent_id;
	}
	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}
	
}
