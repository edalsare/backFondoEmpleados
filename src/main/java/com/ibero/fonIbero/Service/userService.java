package com.ibero.fonIbero.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibero.fonIbero.Exceptions.ICException;
import com.ibero.fonIbero.Model.user;
import com.ibero.fonIbero.Repository.userRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
public class userService {
	private userRepository userrepository;
	
	public user create(user newUser) {
		return userrepository.save(newUser);
	}
	
	public user loginUser(String usuario, String password) {
		user userToLogin = userrepository.getByUsuario(usuario).orElseThrow(ICException::new);
		return userToLogin;
	}

}
