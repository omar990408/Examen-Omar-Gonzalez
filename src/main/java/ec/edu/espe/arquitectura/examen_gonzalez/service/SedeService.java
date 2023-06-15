package ec.edu.espe.arquitectura.examen_gonzalez.service;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Sede;
import ec.edu.espe.arquitectura.examen_gonzalez.repository.SedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeService {

    private final SedeRepository sedeRepository;

    public SedeService(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    public List<Sede> findByInstitucion(Integer institucion) {
        return this.sedeRepository.findByCodigoInstitucion(institucion);
    }
}
