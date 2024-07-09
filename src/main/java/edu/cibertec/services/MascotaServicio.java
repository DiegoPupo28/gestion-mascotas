package edu.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.models.Mascota;
import edu.cibertec.repository.MascotaRepositorio;

@Service
public class MascotaServicio {
	@Autowired
	private MascotaRepositorio mascotaRepositorio;
	
	public List<Mascota> listAll(String palabraClave){
		if (palabraClave != null) {
			return mascotaRepositorio.findAll(palabraClave);
		}
		
		return mascotaRepositorio.findAll();
	}
	
	public void save(Mascota mascota) {
		mascotaRepositorio.save(mascota);
	}
	
	public Mascota get(Long id) {
		return mascotaRepositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		mascotaRepositorio.deleteById(id);
	}
}
