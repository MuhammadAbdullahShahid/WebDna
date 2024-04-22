package com.example.webDna.entity.entities.fee;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fee")
public class Fee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private double feeAmount;


}
