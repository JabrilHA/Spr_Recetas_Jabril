package com.ipartek.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.Model.Receta;
import com.ipartek.Repository.RecetaRepository;

@Controller
public class MainController {
	
	@Autowired 
	RecetaRepository recetaRepo;
	
	@RequestMapping("/")
	public String cargarInicio(Model model) {
	
		List<Receta> listarecetas = recetaRepo.findAll();
	
		model.addAttribute("art_listaRecetas", listarecetas);
		
		return "mostrar";
	}

}
