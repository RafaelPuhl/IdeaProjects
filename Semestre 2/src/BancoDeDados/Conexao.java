package BancoDeDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() throws SQLException{
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smellhair","root","Millefire2011");
        }
        catch (ClassNotFoundException e){
            System.out.println("Classe não encontrada" + e);
        }
        return connection;
    }
}