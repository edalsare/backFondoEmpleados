package com.ibero.fonIbero.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibero.fonIbero.Model.user;

@Repository
public interface userRepository extends JpaRepository<user, Integer>{
	
	Optional<user> getByUsuario(String usuario);

}
