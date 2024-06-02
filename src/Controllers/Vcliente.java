
package Controllers;

public class Vcliente extends Vpersona{
    
    private String codigo_cliente;

    public Vcliente() {
    }

    public Vcliente(String codigo_cliente, int idpersona, String nombre, String primer_apellido, String segundo_apellido, String tipo_documento, String numero_documento, String direccion, String telefono, String email) {
        super(idpersona, nombre, primer_apellido, segundo_apellido, tipo_documento, numero_documento, direccion, telefono, email);
        this.codigo_cliente = codigo_cliente;
    }

    

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
    
    
}
