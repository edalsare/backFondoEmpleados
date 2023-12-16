package com.ibero.fonIbero.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.fonIbero.Model.email;
import com.ibero.fonIbero.Service.emailService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("send_mail")
@CrossOrigin("*")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class emailController {
	private emailService emailServ;
	
	@PostMapping("/save")
	public  ResponseEntity<Object> users(@RequestBody email correo){
		
	emailServ.create(correo);
		return ResponseEntity.ok().body("email enviado");
		
	}
}
