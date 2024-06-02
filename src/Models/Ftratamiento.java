
package Models;

import Controllers.Vtratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ftratamiento {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public int totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        //se almacenaran los titulos
        String [] titulos = {"ID", "Tratamiento", "Descripción", "Cantidad", "Precio"};
        
        //se almacenaran registros
        String [] registros = new String [5];
        
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "SELECT * FROM tratamiento WHERE nombre LIKE '%"+ buscar + "%' ORDER BY idtratamiento DESC";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            //recorrer los registros
            while (rs.next()) {
                registros [0] = rs.getString("idtratamiento");
                registros [1] = rs.getString("nombre");
                registros [2] = rs.getString("descripcion");
                registros [3] = rs.getString("cantidad_tratamientos");
                registros [4] = rs.getString("precio_tratamiento");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (Vtratamiento dts){
        sSQL = "INSERT INTO tratamiento (nombre, descripcion, cantidad_tratamientos, precio_tratamiento)" +
                    "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            //envar uno a uno todos los valores
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getCantidad_tratamientos());
            pst.setDouble(4, dts.getPrecio_tratamiento());
            
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
    
    public boolean editar (Vtratamiento dts){
        sSQL = "UPDATE tratamiento SET nombre=?, descripcion=?, cantidad_tratamiento=?, precio_tratamiento=?" +
                "WHERE idtratamiento=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getDescripcion());
            pst.setString(3, dts.getCantidad_tratamientos());
            pst.setDouble(4, dts.getPrecio_tratamiento());
            
            pst.setInt(5, dts.getIdtratamiento());
            
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
    
    public boolean eliminar (Vtratamiento dts){
        sSQL = "DELETE FROM tratamiento WHERE idtratamiento=?";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdtratamiento());
            
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
