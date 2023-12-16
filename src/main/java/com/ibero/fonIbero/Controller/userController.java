package com.ibero.fonIbero.Controller;

import java.util.LinkedHashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.fonIbero.Model.user;
import com.ibero.fonIbero.Service.userService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("register")
@CrossOrigin("*")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class userController {
	
	private userService userServ;
	
	@PostMapping("/save")
	public  ResponseEntity<Object> users(@RequestBody user usr){
		
		userServ.create(usr);
		return ResponseEntity.ok().body("usuario registrado satisfactoriamente");
		
	}
	
	
	@PostMapping("/login")
	public user login(@RequestBody LinkedHashMap<String, String> body) {
		String email = body.get("usuario");
		String password = body.get("password");
		
		return userServ.loginUser(email, password);
	}

}
