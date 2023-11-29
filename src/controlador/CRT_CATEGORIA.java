package controlador;

import java.sql.Connection;
import modelo.CATEGORIA;
import Conexcion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CRT_CATEGORIA {

    public boolean GUARDAR(CATEGORIA objeto) {

        boolean respuesta = false;

        Connection cn = conexion.conectar();

        try {

            String url = "INSERT INTO CATEGORIA VALUES(?,?,?)";

            PreparedStatement consulta = cn.prepareStatement(url);
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a las categorias");

        }

        return respuesta;

    }

    public boolean CategoriaExistente(String categoria) {

        boolean respuesta = false;

        String sql = "SELECT Descripcion FROM CATEGORIA WHERE Descripcion='" + categoria + "';";

        Statement st;

        try {

            Connection cn = conexion.conectar();

            st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                respuesta = true;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a las categorias");

        }

        return respuesta;

    }
    
    public boolean ACTUALIZAR(CATEGORIA objeto, int idCategoria) {

        boolean respuesta = false;

        Connection cn = conexion.conectar();

        try {

            String url = "UPDATE CATEGORIA SET Descripcion =? WHERE ID_Categoria ='"+idCategoria+"'";

            PreparedStatement consulta = cn.prepareStatement(url);
            consulta.setString(1, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a las categorias");

        }

        return respuesta;

    }
    
    public boolean ELIMINAR(int idCategoria) {

        boolean respuesta = false;

        Connection cn = conexion.conectar();

        try {

            String url = "DELETE FROM CATEGORIA WHERE ID_Categoria ='"+idCategoria+"'";

            PreparedStatement consulta = cn.prepareStatement(url);
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {

                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error no se pudo conectar a las categorias");

        }

        return respuesta;

    }

}
