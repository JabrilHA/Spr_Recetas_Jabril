package com.ipartek.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.Model.Dificultad;
import com.ipartek.Repository.DificultadRepository;


import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class InicializarDatos {
	
	@Autowired
	private DificultadRepository dificultadRepo;
	
	@PostConstruct
	@Transactional
	public void cargarDatos() {
		//Crear Dificultades
		dificultadRepo.save(new Dificultad(1, "Fácil"));
		dificultadRepo.save(new Dificultad(2, "Normal"));
		dificultadRepo.save(new Dificultad(3, "Difícil"));
		
		
	}
}
