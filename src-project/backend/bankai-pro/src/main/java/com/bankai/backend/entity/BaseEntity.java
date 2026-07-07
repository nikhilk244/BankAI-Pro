package com.bankai.backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class BaseEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDateTime createAt;
	
	@Column(nullable = false)
	private LocalDateTime updateAt;
	
	@Column(nullable = false)
	private Boolean isDeleted = false;
}
