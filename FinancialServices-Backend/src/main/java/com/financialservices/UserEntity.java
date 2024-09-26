package com.financialservices;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.annotation.Generated;
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
	
	@NonNull
	private String firstname;
	@NonNull
	private String secondname;
	@NonNull
	private char gender;
	@NonNull
	private String dob;
	
	@NonNull
	private String mothername;
	@NonNull
	private String email;
	
	@NonNull
	private String country;
	
	@NonNull
	private String phonenumber;
	
	
}
