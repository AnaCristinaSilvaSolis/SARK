
package Controllers;

public class Vbarbero extends Vpersona{
    
    private Double sueldo;
    private String acceso;
    private String login;
    private String password;
    private String estado;

    public Vbarbero() {
    }

    public Vbarbero(Double sueldo, String acceso, String login, String password, String estado, int idpersona, String nombre, String primer_apellido, String segundo_apellido, String tipo_documento, String numero_documento, String direccion, String telefono, String email) {
        super(idpersona, nombre, primer_apellido, segundo_apellido, tipo_documento, numero_documento, direccion, telefono, email);
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
