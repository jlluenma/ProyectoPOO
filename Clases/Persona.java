package POO.proyecto.modeloKFC.Clases;

public abstract class Persona {
    private int idPersona;
    private String nombre;
    private String telefono;
    private String email;

    public Persona(int idPersona, String nombre, String telefono, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters and Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}