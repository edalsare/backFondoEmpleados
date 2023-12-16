package com.ibero.fonIbero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibero.fonIbero.Model.email;

@Repository
public interface emailRepository extends JpaRepository<email, Integer>{

}
