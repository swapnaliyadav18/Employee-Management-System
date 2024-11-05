package com.excelr.model;


import jakarta.persistence.*;
@Embeddable
public class FinanceDetails {
    

    private String panCard;    
    private String aadharCard;    
    private String bankName;    
    private String branch;   
    private String ifscCode;    
    private String ctcBreakup;

    //getter setter

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCtcBreakup() {
		return ctcBreakup;
	}

	public void setCtcBreakup(String ctcBreakup) {
		this.ctcBreakup = ctcBreakup;
	}
    
}