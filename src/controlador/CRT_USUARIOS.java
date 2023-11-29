package controlador;

import Conexcion.conexion;
import java.sql.Connection;
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


}
