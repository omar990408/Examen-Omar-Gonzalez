package ec.edu.espe.arquitectura.examen_gonzalez.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

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

    public Edificio() {
    }

    public Edificio(EdificioPK edificioPK) {
        this.edificioPK = edificioPK;
    }

    public EdificioPK getEdificioPK() {
        return edificioPK;
    }

    public void setEdificioPK(EdificioPK edificioPK) {
        this.edificioPK = edificioPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "edificioPK=" + edificioPK +
                ", nombre='" + nombre + '\'' +
                ", pisos=" + pisos +
                ", superficie=" + superficie +
                ", version=" + version +
                ", sede=" + sede +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(edificioPK, edificio.edificioPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edificioPK);
    }
}
