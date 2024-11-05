//package com.excelr.model;
//
//
//import jakarta.persistence.*;
//@Embeddable
////@Entity
////@Table(name = "finance_details")
//public class Finance_Details {
//    
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////    @Id
////    @OneToOne
////    @JoinColumn(name = "empId", referencedColumnName = "empId")
////    private Employee employee;
//    
//    @Column(name = "pan_card")
//    private String panCard;
//    
//    @Column(name = "aadhar_card")
//    private String aadharCard;
//    
//    @Column(name = "bank_name")
//    private String bankName;
//    
//    @Column(name = "branch")
//    private String branch;
//    
//    @Column(name = "ifsc_code")
//    private String ifscCode;
//    
//    @Column(name = "ctc_breakup")
//    private String ctcBreakup;
//
//    
////	public Long getId() {
////		return id;
////	}
////
////	public void setId(Long id) {
////		this.id = id;
////	}
//
////	public Employee getEmployee() {
////		return employee;
////	}
////
////	public void setEmployee(Employee employee) {
////		this.employee = employee;
////	}
//
//	public String getPanCard() {
//		return panCard;
//	}
//
//	public void setPanCard(String panCard) {
//		this.panCard = panCard;
//	}
//
//	public String getAadharCard() {
//		return aadharCard;
//	}
//
//	public void setAadharCard(String aadharCard) {
//		this.aadharCard = aadharCard;
//	}
//
//	public String getBankName() {
//		return bankName;
//	}
//
//	public void setBankName(String bankName) {
//		this.bankName = bankName;
//	}
//
//	public String getBranch() {
//		return branch;
//	}
//
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//
//	public String getIfscCode() {
//		return ifscCode;
//	}
//
//	public void setIfscCode(String ifscCode) {
//		this.ifscCode = ifscCode;
//	}
//
//	public String getCtcBreakup() {
//		return ctcBreakup;
//	}
//
//	public void setCtcBreakup(String ctcBreakup) {
//		this.ctcBreakup = ctcBreakup;
//	}
//    
//    // getters and setters
//    
//}