
package Controllers;

public class Vcubiculo {
    private int idcubiculo;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precio_base;
    private String estado;
    private String tipo_cubiculo;

    public Vcubiculo() {
    }

    public Vcubiculo(int idcubiculo, String numero, String piso, String descripcion, String caracteristicas, Double precio_base, String estado, String tipo_cubiculo) {
        this.idcubiculo = idcubiculo;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_base = precio_base;
        this.estado = estado;
        this.tipo_cubiculo = tipo_cubiculo;
    }

    public int getIdcubiculo() {
        return idcubiculo;
    }

    public void setIdcubiculo(int idcubiculo) {
        this.idcubiculo = idcubiculo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(Double precio_base) {
        this.precio_base = precio_base;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_cubiculo() {
        return tipo_cubiculo;
    }

    public void setTipo_cubiculo(String tipo_cubiculo) {
        this.tipo_cubiculo = tipo_cubiculo;
    }
    
    
}
