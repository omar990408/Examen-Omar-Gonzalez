package ec.edu.espe.arquitectura.examen_gonzalez.controller;

import ec.edu.espe.arquitectura.examen_gonzalez.model.Sede;
import ec.edu.espe.arquitectura.examen_gonzalez.service.SedeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sede")
public class SedeController {

    private final SedeService sedeService;

    public SedeController(SedeService sedeService) {
        this.sedeService = sedeService;
    }

    @GetMapping("/{codeInstitucion}")
    public ResponseEntity<List<Sede>> obtainByInstitucion(@PathVariable(name = "codeInstitucion") Integer codeInstitucion) {
        List<Sede> sedes = this.sedeService.findByInstitucion(codeInstitucion);
        return ResponseEntity.ok(sedes);
    }
}
