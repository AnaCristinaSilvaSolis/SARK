package Models;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    private Connection cn; // Campo para almacenar la conexión
    

    public Conexion() {
        this.cn = null; // Inicializamos el campo de la conexión como null
    }

    public Connection conectar() {
        // Capturador de errores
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Asignamos la conexión creada a nuestro campo 'cn'
            this.cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kalimanfinally?serverTimezone=UTC", "root", "root");
            return this.cn; // Devolvemos la conexión
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }

    public void cerrarConexion() {
        try {
            if (this.cn != null) {
                this.cn.close(); // Cerramos la conexión si no es null
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
