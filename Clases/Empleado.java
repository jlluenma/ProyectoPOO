package POO.proyecto.modeloKFC.Clases;

public class Empleado extends Persona {
    private String nombreCargo;

    public Empleado(int idPersona, String nombre, String telefono, String email, String nombreCargo) {
        super(idPersona, nombre, telefono, email);
        this.nombreCargo = nombreCargo;
    }

    // Getter and Setter
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
}