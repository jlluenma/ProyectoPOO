package POO.proyecto.modeloKFC.Clases;

public class Empresa {
    private String idEmpresa;
    private String nombreEmpresa;
    private String direccion;
    private String telefonoEmpresa;
    private String contactoEmail;

    public Empresa(String idEmpresa, String nombreEmpresa, String direccion, String telefonoEmpresa, String contactoEmail) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefonoEmpresa = telefonoEmpresa;
        this.contactoEmail = contactoEmail;
    }

    // Getters and Setters
    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(String contactoEmail) {
        this.contactoEmail = contactoEmail;
    }
}