
package Controllers;


public class Vservicio {
    private int idservicio;
    private int idTratamiento;
    private int idReservas;
    private Double cantidad;
    private Double precio_venta;
    private String estado;

    public Vservicio() {
    }

    public Vservicio(int idservicio, int idTratamiento, int idReservas, Double cantidad, Double precio_venta, String estado) {
        this.idservicio = idservicio;
        this.idTratamiento = idTratamiento;
        this.idReservas = idReservas;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
