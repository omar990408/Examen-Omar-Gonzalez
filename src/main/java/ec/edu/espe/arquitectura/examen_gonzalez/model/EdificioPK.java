package ec.edu.espe.arquitectura.examen_gonzalez.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class EdificioPK implements Serializable {

    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigoEdificio;

    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codigoSede;

    public EdificioPK() {
    }

    public EdificioPK(String codigoEdificio, String codigoSede) {
        this.codigoEdificio = codigoEdificio;
        this.codigoSede = codigoSede;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public void setCodigoEdificio(String codigoEdificio) {
        this.codigoEdificio = codigoEdificio;
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    @Override
    public String toString() {
        return "EdificioPK{" +
                "codigoEdificio='" + codigoEdificio + '\'' +
                ", codigoSede='" + codigoSede + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdificioPK that = (EdificioPK) o;
        return Objects.equals(codigoEdificio, that.codigoEdificio) && Objects.equals(codigoSede, that.codigoSede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEdificio, codigoSede);
    }
}
