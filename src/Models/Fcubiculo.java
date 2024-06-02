
package Models;

import Controllers.Vcubiculo;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fcubiculo {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public int totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        //se almacenaran los titulos
        String [] titulos = {"ID", "Número", "Piso", "Descripción", "Características", "Precio", "Estado", "Tipo de cubículo"};
        
        //se almacenaran registros
        String [] registros = new String [8];
        
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "SELECT * FROM cubiculo WHERE piso LIKE '%"+ buscar + "%' ORDER BY idcubiculo DESC";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            //recorrer los registros
            while (rs.next()) {
                registros [0] = rs.getString("idcubiculo");
                registros [1] = rs.getString("numero");
                registros [2] = rs.getString("piso");
                registros [3] = rs.getString("descripcion");
                registros [4] = rs.getString("caracteristicas");
                registros [5] = rs.getString("precio_base");
                registros [6] = rs.getString("estado");
                registros [7] = rs.getString("tipo_cubiculo");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Vcubiculo dts){
        sSQL = "INSERT INTO cubiculo (numero, piso, descripcion, caracteristicas, precio_base, estado, tipo_cubiculo)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            //envar uno a uno todos los valores
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_base());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_cubiculo());
            
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
    
    public boolean editar (Vcubiculo dts){
        sSQL = "UPDATE cubiculo SET numero=?, piso=?, descripcion=?, caracteristicas=?, precio_base=?, estado=?, tipo_cubiculo=?" +
                "WHERE idcubiculo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecio_base());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_cubiculo());
            pst.setInt(8, dts.getIdcubiculo());
            
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
    
    public boolean eliminar (Vcubiculo dts){
        sSQL = "DELETE FROM cubiculo WHERE idcubiculo=?";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcubiculo());
            
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
    
    public DefaultTableModel mostrarvista(String buscar){
        DefaultTableModel modelo;
        
        //se almacenaran los titulos
        String [] titulos = {"ID", "Número", "Piso", "Descripción", "Características", "Precio", "Estado", "Tipo de cubículo"};
        
        //se almacenaran registros
        String [] registros = new String [8];
        
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "SELECT * FROM cubiculo WHERE piso LIKE '%"+ buscar + "%' AND estado='Disponible' ORDER BY idcubiculo DESC";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            //recorrer los registros
            while (rs.next()) {
                registros [0] = rs.getString("idcubiculo");
                registros [1] = rs.getString("numero");
                registros [2] = rs.getString("piso");
                registros [3] = rs.getString("descripcion");
                registros [4] = rs.getString("caracteristicas");
                registros [5] = rs.getString("precio_base");
                registros [6] = rs.getString("estado");
                registros [7] = rs.getString("tipo_cubiculo");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean desocupar (Vcubiculo dts){
        sSQL = "UPDATE cubiculo SET estado='Disponible'" +
                "WHERE idcubiculo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            
            pst.setInt(1, dts.getIdcubiculo());
            
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
    
    public boolean ocupar (Vcubiculo dts){
        sSQL = "UPDATE cubiculo SET estado='Ocupado'" +
                "WHERE idcubiculo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            
            pst.setInt(1, dts.getIdcubiculo());
            
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
