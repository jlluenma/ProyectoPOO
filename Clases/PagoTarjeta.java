package POO.proyecto.modeloKFC.Clases;

import java.util.Date;

public class PagoTarjeta implements Pago {
    private double monto;
    private String titular;
    private String numeroTarjeta;
    private Date fechaVencimiento;
    private int claveSeguridad;

    public PagoTarjeta(double monto, String titular, String numeroTarjeta, Date fechaVencimiento, int claveSeguridad) {
        this.monto = monto;
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.claveSeguridad = claveSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta de: " + monto + " realizado por " + titular);
    }

    // Getters and Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }
}