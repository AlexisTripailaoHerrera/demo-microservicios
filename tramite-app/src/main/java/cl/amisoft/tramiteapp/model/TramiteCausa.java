package cl.amisoft.tramiteapp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tramite_causa", schema = "pjud")
public class TramiteCausa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "causa_id", nullable = false)
    private Long causa;
    @Column(name = "nombre_tramite")
    private String nombreTramite;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    public TramiteCausa() {
    }

    public TramiteCausa(Builder builder) {
        this.id = builder.id;
        this.causa = builder.causa;
        this.nombreTramite = builder.nombreTramite;
        this.fechaCreacion = builder.fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCausa() {
        return causa;
    }

    public void setCausa(Long causa) {
        this.causa = causa;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public static class Builder {
        private Long id;
        private Long causa;
        private String nombreTramite;
        private LocalDate fechaCreacion;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder causa(Long causa) {
            this.causa = causa;
            return this;
        }

        public Builder nombreTramite(String nombreTramite) {
            this.nombreTramite = nombreTramite;
            return this;
        }

        public Builder fechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
            return this;
        }

        public TramiteCausa build() {
            return new TramiteCausa(this);
        }

    }
}
