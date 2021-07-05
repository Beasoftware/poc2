package com.no.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table(name = "userreg_tbl")
@Data
@Getter
public class User {
	@Id
	@GeneratedValue
	private int userid;
	private String name;
	private String email;
	private int mobileno;
	private String Designation;
	private int salary;
	private String dob;
	private String joiningdate;
}// class
