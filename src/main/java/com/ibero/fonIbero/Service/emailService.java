package com.ibero.fonIbero.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibero.fonIbero.Model.email;
import com.ibero.fonIbero.Repository.emailRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
public class emailService {
	
	private emailRepository emailrepo;
	
	public email create(email email) {
		return emailrepo.save(email);
	}

}
