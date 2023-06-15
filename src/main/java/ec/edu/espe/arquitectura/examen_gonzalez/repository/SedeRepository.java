package ec.edu.espe.arquitectura.examen_gonzalez.repository;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SedeRepository extends JpaRepository<Sede, String> {

    List<Sede> findByCodigoInstitucion(Integer institucion);

}
