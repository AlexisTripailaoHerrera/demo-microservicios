package cl.amisoft.causaapp.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class CausaVo implements Serializable {
    private Long id;
    private String nombre;
    private LocalDate fechaCreacion;
    private List<TramiteCausaVo> tramites;

    public CausaVo(Builder builder){
        id = builder.id;
        nombre = builder.nombre;
        fechaCreacion = builder.fechaCreacion;
        tramites = builder.tramites;
    }

    public CausaVo(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<TramiteCausaVo> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteCausaVo> tramites) {
        this.tramites = tramites;
    }

    public static class Builder {

        private Long id;
        private String nombre;
        private LocalDate fechaCreacion;
        private List<TramiteCausaVo> tramites;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder fechaCreacion(LocalDate fechaCreacion){
            this.fechaCreacion = fechaCreacion;
            return this;
        }

        public Builder tramites (List<TramiteCausaVo> tramites){
            this.tramites = tramites;
            return this;
        }

        public CausaVo build(){
            return new CausaVo(this);
        }
    }
}
