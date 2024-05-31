package POO.proyecto.modeloKFC.Clases;

public class Combo {
        private int idCombo;
        private String nombreCombo;
        private String descripcion;
        private double precio;

        public Combo(int idCombo, String nombreCombo, String descripcion, double precio) {
            this.idCombo = idCombo;
            this.nombreCombo = nombreCombo;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        // Getters and Setters
        public int getIdCombo() {
            return idCombo;
        }

        public void setIdCombo(int idCombo) {
            this.idCombo = idCombo;
        }

        public String getNombreCombo() {
            return nombreCombo;
        }

        public void setNombreCombo(String nombreCombo) {
            this.nombreCombo = nombreCombo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }

