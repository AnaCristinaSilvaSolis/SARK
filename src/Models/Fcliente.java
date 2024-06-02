package Models;

import Controllers.Vcliente;
import Controllers.Vtratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fcliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";

    public int totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        //se almacenaran los titulos
        String[] titulos = {"ID", "Nombre", "Primer apellido", "Segundo apellido", "Tipo documento", "Número de documento",
            "Dirección", "Teléfono", "Correo", "Código cliente"};

        //se almacenaran registros
        String[] registros = new String[10];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT p.idpersona, p.nombre, p.primer_apellido, p.segundo_apellido, p.tipo_documento, p.numero_documento, "
                + "p.direccion, p.telefono, p.email, c.codigo_cliente FROM persona p INNER JOIN cliente c "
                + "ON p.idpersona=c.idpersona WHERE numero_documento LIKE '%" + buscar + "%' ORDER BY idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            //recorrer los registros
            while (rs.next()) {
                registros[0] = rs.getString("idpersona");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("primer_apellido");
                registros[3] = rs.getString("segundo_apellido");
                registros[4] = rs.getString("tipo_documento");
                registros[5] = rs.getString("numero_documento");
                registros[6] = rs.getString("direccion");
                registros[7] = rs.getString("telefono");
                registros[8] = rs.getString("email");
                registros[9] = rs.getString("codigo_cliente");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Vcliente dts) {
        sSQL = "INSERT INTO persona (nombre, primer_apellido, segundo_apellido, tipo_documento, numero_documento,"
                + "direccion, telefono, email)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        sSQL2 = "INSERT INTO cliente (idpersona, codigo_cliente) "
                + "VALUES((SELECT idpersona FROM persona ORDER BY idpersona DESC LIMIT 1), ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getPrimer_apellido());
            pst.setString(3, dts.getSegundo_apellido());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNumero_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            pst2.setString(1, dts.getCodigo_cliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Vcliente dts) {
        sSQL = "UPDATE persona SET nombre=?, primer_apellido=?, segundo_apellido=?, tipo_documento=?, numero_documento=?,"
                + "direccion=?, telefono=?, email=?"
                + "WHERE idpersona=?";
        sSQL2 = "UPDATE cliente SET codigo_cliente=?"
                + "WHERE idpersona=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getPrimer_apellido());
            pst.setString(3, dts.getSegundo_apellido());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNumero_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            pst.setInt(9, dts.getIdpersona());

            pst2.setString(1, dts.getCodigo_cliente());
            pst2.setInt(2, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Vcliente dts) {
        sSQL = "DELETE FROM cliente WHERE idpersona=?";
        sSQL2 = "DELETE FROM persona WHERE idpersona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdpersona());

            pst2.setInt(1, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
