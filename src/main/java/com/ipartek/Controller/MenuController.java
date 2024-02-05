package com.ipartek.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.Model.Dificultad;
import com.ipartek.Model.Receta;
import com.ipartek.Repository.DificultadRepository;
import com.ipartek.Repository.RecetaRepository;

@Controller
public class MenuController {

	@Autowired 
	RecetaRepository recetaRepo;
	
	@Autowired
	DificultadRepository dificultadRepo;
	
	//Mostrar 
	@RequestMapping("/menu_mostrar")
	public String menu_mostrar() {
		
		return "redirect:/";
	}
	
	//Insertar
	@RequestMapping("/menu_crearReceta")
	public String menu_crearReceta (Model model){
		List<Dificultad> listadificultades = dificultadRepo.findAll();
		
		model.addAttribute("art_listaDificultades", listadificultades);
		model.addAttribute("objeto_entidad", new Receta());
		
		return "insertar";
	}
}
