
package Models;

import Controllers.Vcomprobante;
import Controllers.Vtratamiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fcomprobante {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public int totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        //se almacenaran los titulos
        String [] titulos = {"ID", "idReserva", "Tipo comprobante", "Número comprobante", "IGV", "Total", "Fecha emisión", "Fecha pago"};
        
        //se almacenaran registros
        String [] registros = new String [8];
        
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "SELECT * FROM comprobante WHERE idReserva="+ buscar + " ORDER BY idcomprobante DESC";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            //recorrer los registros
            while (rs.next()) {
                registros [0] = rs.getString("idcomprobante");
                registros [1] = rs.getString("idReserva");
                registros [2] = rs.getString("tipo_comprobante");
                registros [3] = rs.getString("num_comprobante");
                registros [4] = rs.getString("igv");
                registros [5] = rs.getString("total_pago");
                registros [6] = rs.getString("fecha_emision");
                registros [7] = rs.getString("fecha_pago");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Vcomprobante dts){
        sSQL = "INSERT INTO comprobante (idReserva, tipo_comprobante, num_comprobante, igv, total_pago, fecha_emision, fecha_pago)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            //envar uno a uno todos los valores
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipo_comprobante());
            pst.setString(3, dts.getNum_comprobante());
            pst.setDouble(4, dts.getIgv());
            pst.setDouble(5, dts.getTotal_pago());
            pst.setDate(6, Date.valueOf(dts.getFecha_emision()));
            pst.setDate(7, Date.valueOf(dts.getFecha_pago()));
            
            int n = pst.executeUpdate();
            
            if(n != 0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar (Vcomprobante dts){
        sSQL = "UPDATE comprobante SET idReserva=?, tipo_comprobante=?, num_comprobante=?, igv=?, total_pago=?, fecha_emision=?, fecha_pago=?" +
                "WHERE idcomprobante=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());
            pst.setString(2, dts.getTipo_comprobante());
            pst.setString(3, dts.getNum_comprobante());
            pst.setDouble(4, dts.getIgv());
            pst.setDouble(5, dts.getTotal_pago());
            pst.setDate(6, Date.valueOf(dts.getFecha_emision()));
            pst.setDate(7, Date.valueOf(dts.getFecha_pago()));
            
            pst.setInt(8, dts.getIdcomprobante());
            
            int n = pst.executeUpdate();
            
            if(n != 0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar (Vcomprobante dts){
        sSQL = "DELETE FROM comprobante WHERE idcomprobante=?";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcomprobante());
            
            int n = pst.executeUpdate();
            
            if(n != 0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
