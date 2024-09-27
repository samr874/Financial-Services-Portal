package com.financialservices;

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	
	
	
}
