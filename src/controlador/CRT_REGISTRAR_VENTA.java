package controlador;

import Conexcion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CABECERA_VENTA;
import modelo.DETALLE_VENTA;

/**
 * @author edison
 */
public class CRT_REGISTRAR_VENTA {
    
    //ultimo id de la cabecera
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    /**
     * **************************************************
     * metodo para guardar la cabecera de venta
     * **************************************************
     */
    public boolean guardar(CABECERA_VENTA objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into CABECERA_VENTAS values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getId_cliente());
            consulta.setDouble(3, objeto.getValorPrecio());
            consulta.setString(4, objeto.getFechaVenta());
            consulta.setInt(5, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para guardar el detalle de venta
     * **************************************************
     */
    public boolean guardarDetalle(DETALLE_VENTA objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into DETALLE_VENTA values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getId_Producto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIva());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setInt(10, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de venta: " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(CABECERA_VENTA objeto, int idCabeceraVenta) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update CABECERA_VENTAS set ID_Cliente = ?, estado = ? "
                            + "where ID_CaVenta ='" + idCabeceraVenta + "'");
            consulta.setInt(1, objeto.getId_cliente());
            consulta.setInt(2, objeto.getEstado());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de venta: " + e);
        }
        return respuesta;
    }
    
}
