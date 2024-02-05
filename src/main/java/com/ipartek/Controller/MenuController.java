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
import com.ipartek.messages.GestorMensajes;

import jakarta.servlet.http.HttpSession;

@Controller
public class MenuController {

	@Autowired
	RecetaRepository recetaRepo;

	@Autowired
	DificultadRepository dificultadRepo;

	// Mostrar
	@RequestMapping("/menu_mostrar")
	public String menu_mostrar(Model model, HttpSession session) {

		List<Receta> listarecetas = recetaRepo.findAll();

		model.addAttribute("art_listaRecetas", listarecetas);
		GestorMensajes.borrarMensaje(session);

		return "mostrar";
	}

	// Insertar
	@RequestMapping("/menu_crearReceta")
	public String menu_crearReceta(Model model, HttpSession session) {
		List<Dificultad> listadificultades = dificultadRepo.findAll();

		model.addAttribute("art_listaDificultades", listadificultades);
		model.addAttribute("objeto_entidad", new Receta());

		GestorMensajes.borrarMensaje(session);
		return "insertar";
	}
}
