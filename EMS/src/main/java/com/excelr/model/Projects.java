package com.excelr.model;

import java.util.*;

//import com.excelr.entity.Employee;

import jakarta.persistence.*;
@Embeddable
@Entity
@Table(name = "projects")
public class Projects {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "project_id")
    private String projectCode;
    
    @Column(name = "start_date")
    private Date startDate;
    
    @Column(name = "end_date")
    private Date endDate;
    
    @Column(name = "client_project_name")
    private String clientProjectName;
    
    @Column(name = "reporting_manager_code/mail")
    private String reportingManagerCode;
    
    @ManyToMany
    @JoinTable(
        name = "employee_projects",
        joinColumns = @JoinColumn(name = "project_id"),
        inverseJoinColumns = @JoinColumn(name = "empId")
    )
    private List<Employee> employees;
    @ManyToOne
    @JoinColumn(name = "empId")
    private Employee employee;

    // getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getClientProjectName() {
		return clientProjectName;
	}

	public void setClientProjectName(String clientProjectName) {
		this.clientProjectName = clientProjectName;
	}

	public String getReportingManagerCode() {
		return reportingManagerCode;
	}

	public void setReportingManagerCode(String reportingManagerCode) {
		this.reportingManagerCode = reportingManagerCode;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
    
}