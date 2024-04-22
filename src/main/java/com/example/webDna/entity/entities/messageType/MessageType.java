 package com.example.webDna.entity.entities.messageType;


 import jakarta.persistence.*;
 import lombok.Data;

 @Data
 @Entity
 @Table(name="message_type_table")
public class MessageType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "message_type_indicator")
	private String messageTypeIndicator;


}
