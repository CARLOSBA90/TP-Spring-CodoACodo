package com.turnos.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

///tabla base de datos
@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	private Long id;
	
	@Column(name="username", length = 50, unique = true)
	private String username;
	
	@Column(name="password", length = 50)
	private String password;

}
