package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private BigDecimal salary;

	private String status;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="department")
	private Department department1;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="department")
	private Department department2;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Department getDepartment1() {
		return this.department1;
	}

	public void setDepartment1(Department department1) {
		this.department1 = department1;
	}

	public Department getDepartment2() {
		return this.department2;
	}

	public void setDepartment2(Department department2) {
		this.department2 = department2;
	}

}