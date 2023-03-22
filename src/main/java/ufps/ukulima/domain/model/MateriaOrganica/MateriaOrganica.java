package ufps.ukulima.domain.model.MateriaOrganica;


public class MateriaOrganica {
    private Integer id;
    private Float valorMin;
    private Float valorMax;
    private String interpretacion;

    public MateriaOrganica() {}

    public MateriaOrganica(Integer id, Float valorMin, Float valorMax, String interpretacion) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorMin() {
        return valorMin;
    }

    public void setValorMin(Float valorMin) {
        this.valorMin = valorMin;
    }

    public Float getValorMax() {
        return valorMax;
    }

    public void setValorMax(Float valorMax) {
        this.valorMax = valorMax;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "MateriaOrganica{" +
                "id=" + id +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", interpretacion='" + interpretacion + '\'' +
                '}';
    }
}

