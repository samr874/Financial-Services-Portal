package com.financialservices;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan_detail")
public class LoanEntity {

	@Id
	private long loanid;
	
	@Column(nullable = false)
	private String providername;
	
	@Column(nullable = false)
	private String loantype;
	
	@Column(nullable=false)
	private long loanamount;
	
	@Column(nullable=false)
	private int intrestrate;
	
	
	public long getLoanid() {
		return loanid;
	}


	public void setLoanid(long loanid) {
		this.loanid = loanid;
	}


	public String getProvidername() {
		return providername;
	}


	public void setProvidername(String providername) {
		this.providername = providername;
	}


	public String getLoantype() {
		return loantype;
	}


	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}


	public long getLoanamount() {
		return loanamount;
	}


	public void setLoanamount(long loanamount) {
		this.loanamount = loanamount;
	}


	public int getIntrestrate() {
		return intrestrate;
	}


	public void setIntrestrate(int intrestrate) {
		this.intrestrate = intrestrate;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public LoanEntity(long loanid, String providername, String loantype, long loanamount, int intrestrate) {
		super();
		this.loanid = loanid;
		this.providername = providername;
		this.loantype = loantype;
		this.loanamount = loanamount;
		this.intrestrate = intrestrate;
	}


	public LoanEntity() {
		super();
	}

	
	
	
	
	
	
}
