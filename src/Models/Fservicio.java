package Models;

import Controllers.Vservicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fservicio {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public int totalRegistros;
    public Double totalservicios;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        //se almacenaran los titulos
        String[] titulos = {"ID", "idReservas", "idTratamiento",  "Tratamiento",  "Cantidad", "Precio venta", "Estado"};

        //se almacenaran registros
        String[] registros = new String[7];

        totalRegistros = 0;
        totalservicios = 0.0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT s.idservicio, s.idReservas, s.idTratamiento,  t.nombre,  s.cantidad, s.precio_venta,"
                + "s.estado FROM servicio s INNER JOIN tratamiento t ON s.idTratamiento=t.idtratamiento"
                + " WHERE s.idReservas =" + buscar + " ORDER BY s.idservicio DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            //recorrer los registros
            while (rs.next()) {
                registros[0] = rs.getString("idservicio");
                registros[1] = rs.getString("idReservas");
                registros[2] = rs.getString("idTratamiento");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("cantidad");
                registros[5] = rs.getString("precio_venta");
                registros[6] = rs.getString("estado");

                totalRegistros = totalRegistros + 1;
                totalservicios = totalservicios + (rs.getDouble("cantidad") * rs.getDouble("precio_venta"));
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Vservicio dts) {
        sSQL = "INSERT INTO servicio (idReservas, idTratamiento, cantidad, precio_venta, estado)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            //envar uno a uno todos los valores
            pst.setInt(1, dts.getIdReservas());
            pst.setInt(2, dts.getIdTratamiento());
            pst.setDouble(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Vservicio dts) {
        sSQL = "UPDATE servicio SET idReservas=?, idTratamiento=?, cantidad=?, precio_venta=?, estado=?"
                + "WHERE idservicio=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReservas());
            pst.setInt(2, dts.getIdTratamiento());
            pst.setDouble(3, dts.getCantidad());
            pst.setDouble(4, dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());

            pst.setInt(6, dts.getIdservicio());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Vservicio dts) {
        sSQL = "DELETE FROM servicio WHERE idservicio=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdservicio());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
