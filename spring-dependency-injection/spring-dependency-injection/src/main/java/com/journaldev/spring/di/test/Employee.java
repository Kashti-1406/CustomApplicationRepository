package com.journaldev.spring.di.test;

import java.util.Date;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private int employeeId;
	private String role;
	
	private int dateOfJoining;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int employeeId, String role, int dateOfJoining) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.role = role;
		this.dateOfJoining = dateOfJoining;
	}
	public Employee(int dateOfJoining) {
		super();		
		this.dateOfJoining = dateOfJoining;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(int dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", role=" + role + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfJoining, employeeId, name, role);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return dateOfJoining == other.dateOfJoining && employeeId == other.employeeId
				&& Objects.equals(name, other.name) && Objects.equals(role, other.role);
	}
	

}
