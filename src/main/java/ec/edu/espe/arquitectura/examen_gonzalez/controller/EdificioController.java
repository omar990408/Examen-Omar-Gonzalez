package ec.edu.espe.arquitectura.examen_gonzalez.controller;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Edificio;
import ec.edu.espe.arquitectura.examen_gonzalez.model.Sede;
import ec.edu.espe.arquitectura.examen_gonzalez.service.EdificioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/edificio")
public class EdificioController {

    private final EdificioService edificioService;

    public EdificioController(EdificioService edificioService) {
        this.edificioService = edificioService;
    }

    @GetMapping("/{sedeCode}")
    public ResponseEntity<List<Edificio>> obtainBySedeCode(@PathVariable(name = "sedeCode") Sede sedeCode) {
        List<Edificio> edificios = this.edificioService.listBySedeOrderBySuperficieDesc(sedeCode);
        return ResponseEntity.ok(edificios);
    }

    @PutMapping("/update")
    public ResponseEntity<Edificio> update(@RequestBody Edificio edificio) {
        try {
            Edificio edificioRS = this.edificioService.update(edificio);
            return ResponseEntity.ok(edificioRS);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }
    }
}
