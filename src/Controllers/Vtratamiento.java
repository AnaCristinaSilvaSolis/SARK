
package Controllers;


public class Vtratamiento {
    
    private int idtratamiento;
    private String nombre;
    private String descripcion;
    private String cantidad_tratamientos;
    private Double precio_tratamiento;

    public Vtratamiento() {
    }

    public Vtratamiento(int idtratamiento, String nombre, String descripcion, String cantidad_tratamientos, Double precio_tratamiento) {
        this.idtratamiento = idtratamiento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad_tratamientos = cantidad_tratamientos;
        this.precio_tratamiento = precio_tratamiento;
    }

    public int getIdtratamiento() {
        return idtratamiento;
    }

    public void setIdtratamiento(int idtratamiento) {
        this.idtratamiento = idtratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad_tratamientos() {
        return cantidad_tratamientos;
    }

    public void setCantidad_tratamientos(String cantidad_tratamientos) {
        this.cantidad_tratamientos = cantidad_tratamientos;
    }

    public Double getPrecio_tratamiento() {
        return precio_tratamiento;
    }

    public void setPrecio_tratamiento(Double precio_tratamiento) {
        this.precio_tratamiento = precio_tratamiento;
    }
    
    
}
