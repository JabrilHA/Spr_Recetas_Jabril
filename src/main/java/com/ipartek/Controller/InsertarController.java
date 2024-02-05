package com.ipartek.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.Model.Receta;
import com.ipartek.Repository.RecetaRepository;


@Controller
public class InsertarController {
	
	@Autowired
	private RecetaRepository recetaRepo;
	
	@RequestMapping("/guardarReceta")
	public String guardarReceta(@ModelAttribute Receta objeto_entidad){
		
		recetaRepo.save(objeto_entidad);
		
		return "redirect:/";
	}

}
