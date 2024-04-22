package com.example.webDna.entity.entities.responseCode;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="response_code_table")
public class ResponseCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="response_code")
	private String responsecode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResponse_code() {
		return responsecode;
	}

	public void setResponse_code(String response_code) {
		this.responsecode = response_code;
	}

}