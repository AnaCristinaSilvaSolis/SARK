package Models;

import Controllers.Vreserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Freserva {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public int totalRegistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        //se almacenaran los titulos
        String[] titulos = {"ID", "Idcubiculo", "Número", "Idcliente", "Cliente", "Idbarbero", "Barbero", "Tipo reserva", "Fecha reserva", "Fecha inicio",
             "Fecha fin", "Costo", "Nombre Cliente", "Estado"};

        //se almacenaran registros
        String[] registros = new String[13];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT r.idreserva, r.idCubiculo, c.numero, r.idCliente,"
                + "(SELECT nombre FROM persona WHERE idpersona=r.idCliente)as clienten,"
                + "(SELECT primer_apellido FROM persona WHERE idpersona=r.idCliente)as clientepa,"
                + "r.idBarbero, (SELECT nombre FROM persona WHERE idpersona=r.idBarbero)as barberon,"
                + "(SELECT primer_apellido FROM persona WHERE idpersona=r.idBarbero)as barberopa,"
                + "r.tipo_reserva, r.fecha_reserva, r.fecha_inicio, r.fecha_fin,"
                + "r.costo_total, r.estado FROM reserva r INNER JOIN cubiculo c ON r.idCubiculo=c.idCubiculo "
                + "WHERE r.fecha_reserva LIKE '%" + buscar + "%' ORDER BY idreserva DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            //recorrer los registros
            while (rs.next()) {
                registros[0] = rs.getString("idreserva");
                registros[1] = rs.getString("idCubiculo");
                registros[2] = rs.getString("numero");
                registros[3] = rs.getString("idCliente");
                registros[4] = rs.getString("clienten") + " " + rs.getString("clientepa");
                registros[5] = rs.getString("idBarbero");
                registros[6] = rs.getString("barberon") + " " + rs.getString("barberopa");
                registros[7] = rs.getString("tipo_reserva");
                registros[8] = rs.getString("fecha_reserva");
                registros[9] = rs.getString("fecha_inicio");
                registros[10] = rs.getString("fecha_fin");
                registros[11] = rs.getString("costo_total");
                registros[12] = rs.getString("estado");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Vreserva dts) {
        sSQL = "INSERT INTO reserva (idCubiculo, idCliente, idBarbero, tipo_reserva, fecha_reserva, fecha_inicio, fecha_fin,"
                + "costo_total, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            //envar uno a uno todos los valores
            pst.setInt(1, dts.getIdCubiculo());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdBarbero());
            pst.setString(4, dts.getTipo_reserva());
            /*pst.setDate(5, (Date) dts.getFecha_reserva());
            pst.setDate(6, (Date) dts.getFecha_inicio());
            pst.setDate(7, (Date) dts.getFecha_fin());*/
            pst.setDate(5, Date.valueOf(dts.getFecha_reserva()));
            pst.setDate(6, Date.valueOf(dts.getFecha_inicio()));
            pst.setDate(7, Date.valueOf(dts.getFecha_fin()));
            pst.setDouble(8, dts.getCosto_total());
            pst.setString(9, dts.getEstado());

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

    public boolean editar(Vreserva dts) {
        sSQL = "UPDATE reserva SET idCubiculo=?, idCliente=?, idBarbero=?, tipo_reserva=?, fecha_reserva=?, fecha_inicio=?,"
                + "fecha_fin=?, costo_total=?, estado=?"
                + "WHERE idreserva=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdCubiculo());
            pst.setInt(2, dts.getIdCliente());
            pst.setInt(3, dts.getIdBarbero());
            pst.setString(4, dts.getTipo_reserva());
            /*pst.setDate(5, (Date) dts.getFecha_reserva());
            pst.setDate(6, (Date) dts.getFecha_inicio());
            pst.setDate(7, (Date) dts.getFecha_fin());*/
            pst.setDate(5, Date.valueOf(dts.getFecha_reserva()));
            pst.setDate(6, Date.valueOf(dts.getFecha_inicio()));
            pst.setDate(7, Date.valueOf(dts.getFecha_fin()));
            pst.setDouble(8, dts.getCosto_total());
            pst.setString(9, dts.getEstado());

            pst.setInt(10, dts.getIdreserva());

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

    public boolean eliminar(Vreserva dts) {
        sSQL = "DELETE FROM reserva WHERE idreserva=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdreserva());

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
    
    public boolean pagar(Vreserva dts) {
        sSQL = "UPDATE reserva SET  estado='Pagado' WHERE idreserva=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setInt(1, dts.getIdreserva());

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
