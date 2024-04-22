package com.example.webDna.entity.entities;

import java.util.Date;

import com.example.webDna.entity.entities.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CustomerTypes")
public class CustomerTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID" )
	private Long id;
	
	@Column(name ="shortName" , nullable =true, length = 25, unique=true)
	private String shortName;
	
	@Column(name="description",columnDefinition = "varchar(100) DEFAULT NULL")
	private String description;
	
	@Column(name="isActive",columnDefinition = " tinyint(1) DEFAULT '1'")
	private String isActive;
	
	@Column(name = "type")
    private String type;
	
    @Column(name = "code")
    private String code;
    
    @Column(name="createDate",columnDefinition = "datetime DEFAULT NULL")
	private Date createDate;
    
    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id", nullable = true)
    private Status status;
	
	@ManyToOne
	@JoinColumn(name="createBy",referencedColumnName = "userID",columnDefinition = "bigint DEFAULT NULL")
	private User createBy;
	
	@Column(name="updateDate",columnDefinition = "datetime DEFAULT NULL")
	private Date updateDate;
	
	@ManyToOne
	@JoinColumn(name= "updateBy",referencedColumnName ="userID" ,columnDefinition = "bigint DEFAULT NULL")
	private User updateBy;

	public Long getId() {
		return id;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
    	this.createDate = createDate;
		
	}
	
	public User getCreateBy() {
		return createBy;
	}

	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public User getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}
	
}
