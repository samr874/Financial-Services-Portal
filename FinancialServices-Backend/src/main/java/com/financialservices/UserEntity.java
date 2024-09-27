package com.financialservices;

import org.antlr.v4.runtime.misc.NotNull;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users_Registration")

public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long userid;
	
	
	@Column(nullable = false)
	private String firstname;
	@Column(nullable=false)
	private String secondname;
	@Column(nullable=false)
	private char gender;
	@Column(nullable=false)
	private String dob;
	
	@Column(nullable=false)
	private String mothername;
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String country;
	
	@Column(nullable=false)
	private String phonenumber;
	
	
}
