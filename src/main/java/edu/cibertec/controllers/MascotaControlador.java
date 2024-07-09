package edu.cibertec.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.cibertec.models.Mascota;
import edu.cibertec.services.MascotaServicio;


@Controller
public class MascotaControlador {
	@Autowired
	private MascotaServicio mascotaServicio;
	
	@RequestMapping("/")
	public String verPaginaPrincipal(Model model) {
		return "index";
	}
	
	@RequestMapping("/somos")
	public String verPaginaSomos(Model model) {
		return "somos";
	}
	
	@RequestMapping("/contactanos")
	public String verPaginaContacto(Model model) {
		return "contactanos";
	}
	
	
	@RequestMapping("/adopcion")
	public String verAdopcionMascotas(Model model, @Param("palabraClave") String palabraClave) {
		List<Mascota> listaMascotas = mascotaServicio.listAll(palabraClave);
		model.addAttribute("listaMascotas", listaMascotas);
		model.addAttribute("palabraClave", palabraClave);
		return "adopcion_mascota";
	}
	
	@RequestMapping("/agregar")
	public String mostrarFormularioDeRegistrarMascota(Model model) {
		Mascota mascota = new Mascota();
		model.addAttribute("mascota", mascota);
		return "agregar_mascota";
	}
	
	@RequestMapping(value="/guardar", method=RequestMethod.POST)
	public String guardarMascota(@ModelAttribute("mascota")Mascota mascota) {
		mascotaServicio.save(mascota);
		return "redirect:/adopcion";	
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView mostrarFormularioDeEditarMascota(@PathVariable(name="id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_mascota");
		
		Mascota mascota = mascotaServicio.get(id);
		modelo.addObject("mascota", mascota);
		return modelo;
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarMascota(@PathVariable(name= "id") Long id) {
		mascotaServicio.delete(id);
		return "redirect:/adopcion";
	}
}
