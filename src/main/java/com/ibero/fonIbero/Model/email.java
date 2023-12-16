package com.ibero.fonIbero.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Email")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class email {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idemail;
	private String names;
	private String last_name;
	private Integer id_cliente;
	private String telephone;
	private String correo;
	private String mensaje;
	private String asociado;
	
	public email(String names,String last_name, Integer id_cliente, 
			String telephone, String email, String message, String asociado) {
		this.names = names;
		this.last_name = last_name;
		this.id_cliente = id_cliente;
		this.telephone = telephone;
		this.correo = email;
		this.mensaje = message;
		this.asociado = asociado;
	}

}
