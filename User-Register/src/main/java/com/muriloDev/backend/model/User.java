package com.muriloDev.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="users")
public class User {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String name;
	
	@Column(nullable = false, length = 150)
	private String senha;
	
	@Column(nullable = false, length = 150, unique = true)
	private String email;

}
