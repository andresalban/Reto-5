package co.edu.utp.misiontic2022.c2.model.vo;

public class Requerimiento_2 {
    // Operaciones de la clase requerimiento 2 -- su código

    //region Atributtos
    private String fechaIncio;
    private String nombreConstructora;
    private String cuidad;
    private String nommbreLider;
    private Integer codigoTipo;
    private Integer estrato;
    //endregion

    //region Constructores
    public Requerimiento_2() {
    }

    public Requerimiento_2(String fechaIncio, String nombreConstructora, String cuidad, String nommbreLider, Integer codigoTipo, Integer estrato) {
        this.fechaIncio = fechaIncio;
        this.nombreConstructora = nombreConstructora;
        this.cuidad = cuidad;
        this.nommbreLider = nommbreLider;
        this.codigoTipo = codigoTipo;
        this.estrato = estrato;
    }
    //endregion

    //region Getter & Setter
    public String getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(String fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getNommbreLider() {
        return nommbreLider;
    }

    public void setNommbreLider(String nommbreLider) {
        this.nommbreLider = nommbreLider;
    }

    public Integer getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    //endregion

}
