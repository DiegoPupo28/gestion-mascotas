package edu.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.cibertec.models.Mascota;

public interface MascotaRepositorio extends JpaRepository<Mascota, Long> {
	@Query("SELECT p FROM Mascota p WHERE p.nombre LIKE %?1%"
			+ "OR p.raza LIKE %?1%"
			+ "Or p.sexo LIKE %?1%")
	public List<Mascota> findAll(String palabraClave);
}
