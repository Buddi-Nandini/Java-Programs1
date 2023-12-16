package com.edubridge.Hibernate01;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "new value")
public class Employee{
	

	@Id
	//4 ways auto identity sequence table
	private int empId;
	private String name;
	
	@Column(name = "empAge")
	private int age;
	
	@Column(name = "empGender")
	private String gender;
	public Employee(int empId, String name, int age, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}