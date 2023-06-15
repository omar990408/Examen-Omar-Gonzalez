package ec.edu.espe.arquitectura.examen_gonzalez.service;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Edificio;
import ec.edu.espe.arquitectura.examen_gonzalez.model.EdificioPK;
import ec.edu.espe.arquitectura.examen_gonzalez.repository.EdificioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioService {

    private final EdificioRepository edificioRepository;

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    @Transactional
    public Edificio update (Edificio edificio){
         Edificio edificioTmp = this.edificioRepository.findByEdificioPK(new EdificioPK(edificio.getEdificioPK().getCodigoEdificio(), edificio.getEdificioPK().getCodigoSede()));
         if (edificioTmp != null){
             edificioTmp.setNombre(edificio.getNombre());
             edificioTmp.setPisos(edificio.getPisos());
             edificioTmp.setSuperficie(edificio.getSuperficie());
             this.edificioRepository.save(edificioTmp);
             return edificioTmp;
         }else {
             throw new RuntimeException("Edificio que desea modificar no esta registrado");
         }
    }

    public List<Edificio> listBySedeOrderBySuperficieDesc(String sede){
        return this.edificioRepository.findBySedeOrderBySuperficieDesc(sede);
    }


}
