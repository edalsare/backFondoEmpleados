package com.ibero.fonIbero.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
	@Id
	@Column(name = "client_id")
	private Integer clientId;
	
	@Column(name="usuario")
	private String usuario;
	
	private String email;
	private String password;
}
