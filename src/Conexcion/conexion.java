package Conexcion;

/**
 *
 * @author cesar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    public static Connection conectar() {

        Connection cn = null;

        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost/SistemaVentas", "root", "abelbustamante24");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logró conectar a la base de datos", "Error", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        }

        return cn;

    }

}
