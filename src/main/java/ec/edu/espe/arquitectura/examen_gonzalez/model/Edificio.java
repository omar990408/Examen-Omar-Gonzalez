package ec.edu.espe.arquitectura.examen_gonzalez.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "OFI_EDIFICIO")
public class Edificio {

    @EmbeddedId
    private EdificioPK edificioPK;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "PISOS", nullable = false, precision = 2, scale = 0)
    private Integer pisos;

    @Column(name = "SUPERFICIE", nullable = false, precision = 7, scale = 2)
    private BigDecimal superficie;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false)
    private Sede sede;
}
