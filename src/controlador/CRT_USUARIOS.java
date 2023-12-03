package controlador;

import Conexcion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.USUARIO;

/**
 *
 * @author cesar
 */
public class CRT_USUARIOS {
    
    
    /**
     * **************************************************
     * metodo para guardar un nuevo usuario
     * **************************************************
     */
    public boolean guardar(USUARIO objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into USUARIO values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

    //metodo para inciar sesion
    public boolean LOGIN_USER(USUARIO objeto) {
        
        boolean respuesta = false;
        
        Connection cn = conexion.conectar();
        String sql ="SELECT Usuario,password from USUARIO WHERE Usuario='"+objeto.getUsuario()+"' AND password ='"+objeto.getPassword()+"'";
        Statement st;
        try{
            
            st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                
                respuesta=true;
            
            }
        

        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos");
        
        } 
    
    return respuesta;
}
    
    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "SELECT Usuario FROM USUARIO where Usuario = '" + usuario + "';";
        Statement st;
        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para Iniciar Sesion
     * **************************************************
     */
    public boolean loginUser(USUARIO objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        String sql = "select  Usuario, Password from USUARIO where Usuario = '" + objeto.getUsuario() + "' and Password = '" + objeto.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
    
    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(USUARIO objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update USUARIO set Nombre=?, Apellido = ?, Usuario = ?, Password= ?, Telefono = ?, Estado = ? where ID_usuario ='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from USUARIO where ID_usuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }


}
