import Conexion.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {
/** Clase principal y método MAIN
     * @param args */
    public static void main(String[] args) {
        String consulta="SELECT title,length FROM film";
        
        try {
            Statement sentencia=Conexion.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getString (1) + " " + resultado.getInt(2));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            
            e.printStackTrace();
        }
    }

}
