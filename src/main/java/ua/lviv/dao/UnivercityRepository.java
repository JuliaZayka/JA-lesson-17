package ua.lviv.dao;

import java.util.Date;  
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ua.lviv.domain.Univercity;

public interface UnivercityRepository extends JpaRepository<Univercity, Integer>, CrudRepository<Univercity, Integer>{

	List<Univercity> findByAddress(String email);
	
	
		
}