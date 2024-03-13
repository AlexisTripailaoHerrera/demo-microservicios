package cl.amisoft.causaapp.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class TramiteCausaVo implements Serializable {
    private static final long serialVersionUID = -4989016920622224883L;
    private Long id;
    private Long causa;
    private String nombreTramite;
    private LocalDate fecha;

    public TramiteCausaVo() {
    }

    private TramiteCausaVo(Builder builder) {
        id = builder.id;
        causa = builder.causa;
        nombreTramite = builder.nombreTramite;
        fecha = builder.fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static class Builder {
        private Long id;
        private Long causa;
        private String nombreTramite;
        private LocalDate fecha;

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

        public Builder fecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public TramiteCausaVo build() {
            return new TramiteCausaVo(this);
        }
    }
}


