package POO.proyecto.modeloKFC.Clases;

public class PagoEfectivo implements Pago {
    private double monto;

    public PagoEfectivo(double monto) {
        this.monto = monto;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago en efectivo de: " + monto);
    }

    // Getter and Setter
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}