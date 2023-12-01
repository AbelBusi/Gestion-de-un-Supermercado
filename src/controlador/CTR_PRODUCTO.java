package controlador;

import Conexcion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.PRODUCTO;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class CTR_PRODUCTO {
     /**
     * **************************************************
     * metodo para guardar un nuevo producto
     * **************************************************
     */
    public boolean guardar(PRODUCTO objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into PRODUCTO values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getIdCategoria());
            consulta.setString(3, objeto.getNombre());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecio());
            consulta.setString(6, objeto.getDescripcion());
            consulta.setInt(7, objeto.getPorcentajeIVA());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select Nombre from PRODUCTO where nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
}
