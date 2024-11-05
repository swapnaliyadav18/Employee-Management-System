package com.excelr.model;

import java.util.*;
import jakarta.persistence.*;
@Embeddable
//@Entity
//@Table(name = "professional_details")
public class Professional {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    
//    @OneToOne
//    @JoinColumn(name = "empId", referencedColumnName = "empId")
//    private Employee employee;
    
    @Column(name = "company_mail")
    private String companyMail;
    
    @Column(name = "office_phone")
    private String officePhone;
    
    @Column(name = "office_address")
    private String officeAddress;
    
    @Column(name = "reporting_manager_code/mail")
    private String reportingManagerCode;
    
    @Column(name = "hr_name")
    private String hrName;
    
    @Column(name = "employment_history")
    private String employmentHistory;
    
    @Column(name = "date_of_joining")
    private Date dateOfJoining;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	public String getCompanyMail() {
		return companyMail;
	}

	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getReportingManagerCode() {
		return reportingManagerCode;
	}

	public void setReportingManagerCode(String reportingManagerCode) {
		this.reportingManagerCode = reportingManagerCode;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public String getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(String employmentHistory) {
		this.employmentHistory = employmentHistory;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
    
    // getters and setters
    
}