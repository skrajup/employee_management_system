package com.abc.ems.ENTITY;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // autogenerate id 
    private int empId;
    private String empName;
    private String empCity;
    private String empJobRole;
    private Long empSalary;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_authId")	
    private Authentication authentication;

	public Employee(int empId, String empName, String empCity, String empJobRole, Long empSalary,
			Authentication authentication) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empJobRole = empJobRole;
		this.empSalary = empSalary;
		this.authentication = authentication;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpJobRole() {
		return empJobRole;
	}

	public void setEmpJobRole(String empJobRole) {
		this.empJobRole = empJobRole;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
    
	

}
