package controlador;

import Conexcion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.CATEGORIA;
import modelo.PRODUCTO;

/**
 *
 * @author cesar
 */
public class CRT_PRODUCTO {
    
    public boolean GUARDAR(PRODUCTO objeto) {

        boolean respuesta = false;

        Connection cn = conexion.conectar();

        try {

            String url = "INSERT INTO PRODUCTO VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement consulta = cn.prepareStatement(url);
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIVA());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a las categorias");

        }

        return respuesta;

    }

    public boolean ProductoExistente(String producto) {

        boolean respuesta = false;

        String sql = "SELECT Nombre FROM PRODUCTO WHERE Nombre='" + producto+ "';";

        Statement st;

        try {

            Connection cn = conexion.conectar();

            st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                respuesta = true;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a los productos");

        }

        return respuesta;

    }
    
    
}
