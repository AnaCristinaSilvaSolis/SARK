
package Controllers;

import java.time.LocalDate;


public class Vreserva {
    
    private int idreserva;
    private int idCubiculo;
    private int idCliente;
    private int idBarbero;
    private String tipo_reserva;
    private LocalDate fecha_reserva;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Double  costo_total;
    private String estado;

    public Vreserva() {
    }

    public Vreserva(int idreserva, int idCubiculo, int idCliente, int idBarbero, String tipo_reserva, LocalDate fecha_reserva, LocalDate fecha_inicio, LocalDate fecha_fin, Double costo_total, String estado) {
        this.idreserva = idreserva;
        this.idCubiculo = idCubiculo;
        this.idCliente = idCliente;
        this.idBarbero = idBarbero;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo_total = costo_total;
        this.estado = estado;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdCubiculo() {
        return idCubiculo;
    }

    public void setIdCubiculo(int idCubiculo) {
        this.idCubiculo = idCubiculo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public LocalDate getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDate fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Double costo_total) {
        this.costo_total = costo_total;
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    
}
