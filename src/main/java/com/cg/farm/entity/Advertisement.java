package com.cg.farm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="advertise")
public class Advertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@Column(name = "cropType",nullable=false)
	private String cropType;
	
//	@Column(name = "quantity",nullable=false)
	private int quantity;

//	@Column(name = "weight",nullable=false)
	private String weight;
	
//	@Column(name = "price",nullable=false)
	private String price;

	private boolean status;
}
