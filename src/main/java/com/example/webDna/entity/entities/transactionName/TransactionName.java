package com.example.webDna.entity.entities.transactionName;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="transaction_name_table")
public class TransactionName {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name= "transaction_type")
	private String transactiontype;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransaction_type() {
		return transactiontype;
	}

	public void setTransaction_type(String transaction_type) {
		this.transactiontype = transaction_type;
	}
}