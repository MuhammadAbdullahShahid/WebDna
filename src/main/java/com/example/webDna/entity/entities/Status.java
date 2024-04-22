package com.example.webDna.entity.entities;

import java.util.Date;
import java.util.List;


import com.example.webDna.entity.entities.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name = "status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID"  )
	private Long id;

	@Column(name = "ShortDescription", columnDefinition = "varchar(50) NOT NULL")
	private String shortDescription;

	@Column(name = "Description", columnDefinition = "varchar(100) NOT NULL")
	private String Description;

	@Column(name = "isActive", columnDefinition = "tinyint(1) DEFAULT '1'")
	private boolean isActive;

	
	@ManyToOne
	@JoinColumn(name ="createBy", referencedColumnName ="userId")
	private User createBy;
	
	@ManyToOne
	@JoinColumn(name ="updateBy", referencedColumnName ="userId")
	private User updateBy;

	@Column(name = "createdDate", columnDefinition = "datetime DEFAULT NULL")
	private Date createdDate;
	
	@Column(name = "updateDate", columnDefinition = "datetime DEFAULT NULL")
	private Date updateDate;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	public User getCreateBy() {
		return createBy;
	}

	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}

	public User getUpdateBy() {
		return updateBy;
	}

	
	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
       this.createdDate = createdDate;
		
	}

	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
