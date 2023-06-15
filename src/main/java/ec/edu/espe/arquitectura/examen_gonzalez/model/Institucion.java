package ec.edu.espe.arquitectura.examen_gonzalez.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "OFI_INSTITUCION")
public class Institucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_INSTITUCION", nullable = false,precision = 3, scale = 0)
    private Integer codigo;

    @Column(name = "RUC", nullable = false, length = 13)
    private String ruc;

    @Column(name = "RAZON_SOCIAL", nullable = false, length = 250)
    private String razonSocial;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public Institucion() {
    }

    public Institucion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "codigo=" + codigo +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
