package ec.edu.espe.arquitectura.examen_gonzalez.repository;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Edificio;
import ec.edu.espe.arquitectura.examen_gonzalez.model.EdificioPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio, EdificioPK> {

    Edificio findByEdificioPK(EdificioPK edificioPK);
    List<Edificio> findBySedeOrderBySuperficieDesc(String sede);
}
