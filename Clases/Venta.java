package POO.proyecto.modeloKFC.Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private String estado;
    private double total;
    private List<DetalleVenta> detalles;

    public Venta(int idVenta, Date fecha, String estado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.estado = estado;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        total += detalle.getSubtotal();
    }

    // Getters and Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}