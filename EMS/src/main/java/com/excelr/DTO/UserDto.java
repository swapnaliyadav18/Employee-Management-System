package com.excelr.DTO;

public class UserDto {
	
	private String email;
	private String password;
	private String role;
	private String fullname;
	private String empId;
	
	public UserDto(String email, String password, String role, String fullname , String empId) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullname = fullname;
		this.empId=empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
	
	

}
