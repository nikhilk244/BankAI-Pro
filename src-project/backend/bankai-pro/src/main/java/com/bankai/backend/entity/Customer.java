package com.bankai.backend.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


import com.bankai.backend.enums.CustomerStatus;
import com.bankai.backend.enums.Gender;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="customers")
public class Customer extends BaseEntity {

	@Column(name = "first_name",nullable = false, length = 50)
	private String firstName;
	
	@Column(name="last_name",nullable = false, length = 50)
	private String lastName;

	@Column(name = "email", nullable = false,unique = true,length = 100)
	private String email;
	
	@Column(name="mobile_number", nullable = false, unique = true, length = 10)
	private String mobileNumber;
	
	@Column(name="aadhaar_number", nullable = false,unique = true,length = 12)
	private String aadhaarNumber;
	
	@Column(name="pan_number", nullable=false,unique=true,length=10)
	private String panNumber;
	
	@Column(name="password",nullable=false,length=255)
	private String password;
	
	@Column(name="date_of_birth",nullable=false)
	private LocalDate dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender",nullable=false)
	private Gender gender;
	
	@Builder.Default
	@Enumerated(EnumType.STRING)
	@Column(name="status",nullable=false)
	private CustomerStatus status = CustomerStatus.ACTIVE;
}
