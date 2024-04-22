package com.example.webDna.entity.entities.region;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name="region_table")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="fed_region_id")
	private String fedregionid ;

	
	

}
