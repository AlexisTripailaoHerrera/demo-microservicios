package cl.amisoft.tramiteapp.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class TramiteCausaVo implements Serializable {
    private static final long serialVersionUID = 4794192614088964788L;
    private Long id;
    private Long causa;
    private String nombreTramite;
    private LocalDate fechaCreacion;

    public TramiteCausaVo() {
    }

    public TramiteCausaVo(Builder builder) {
        id = builder.id;
        causa = builder.causa;
        nombreTramite = builder.nombreTramite;
        fechaCreacion = builder.fechaCreacion;
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

        public TramiteCausaVo build() {
            return new TramiteCausaVo(this);
        }
    }
}


