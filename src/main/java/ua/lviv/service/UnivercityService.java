package ua.lviv.service;


import java.util.List;
import java.util.stream.Stream;

import ua.lviv.domain.Univercity;

public interface UnivercityService {

	Univercity save(Univercity univercity);

	Univercity findById(Integer id);

	Univercity update(Univercity univercity);

	void deleteById(Integer id);

	List<Univercity> findAll();

	List<Univercity> findByAddress(String email);

	
}