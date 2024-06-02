
package Controllers;

import java.time.LocalDate;

public class Vcomprobante {
    
    private int idcomprobante;
    private int idReserva;
    private String tipo_comprobante;
    private String num_comprobante;
    private Double igv;
    private Double total_pago;
    private LocalDate fecha_emision;
    private LocalDate fecha_pago;

    public Vcomprobante() {
    }

    public Vcomprobante(int idcomprobante, int idReserva, String tipo_comprobante, String num_comprobante, Double igv, Double total_pago, LocalDate fecha_emision, LocalDate fecha_pago) {
        this.idcomprobante = idcomprobante;
        this.idReserva = idReserva;
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.igv = igv;
        this.total_pago = total_pago;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
    }

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(Double total_pago) {
        this.total_pago = total_pago;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    
    
}
