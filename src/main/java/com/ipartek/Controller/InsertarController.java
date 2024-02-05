package com.ipartek.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.Model.Receta;
import com.ipartek.Repository.RecetaRepository;
import com.ipartek.messages.GestorMensajes;

import jakarta.servlet.http.HttpSession;


@Controller
public class InsertarController {
	
	@Autowired
	private RecetaRepository recetaRepo;
	
	@RequestMapping("/guardarReceta")
	public String guardarReceta(@ModelAttribute Receta objeto_entidad,Model model,HttpSession session){
recetaRepo.save(objeto_entidad);
		
		List<Receta> listarecetas = recetaRepo.findAll();
		
		model.addAttribute("art_listaRecetas", listarecetas);
		GestorMensajes.ponerMensaje(1, session);
		
		return "mostrar";
	}

}
