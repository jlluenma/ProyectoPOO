package POO.proyecto.modeloKFC.Clases;

public class DetalleVenta {
    private int idDetalle;
    private Combo combo;
    private int cantidad;
    private double subtotal;

    public DetalleVenta(int idDetalle, Combo combo, int cantidad) {
        this.idDetalle = idDetalle;
        this.combo = combo;
        this.cantidad = cantidad;
        this.subtotal = calcularSubTotal();
    }

    public double calcularSubTotal() {
        return combo.getPrecio() * cantidad;
    }

    // Getters and Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}