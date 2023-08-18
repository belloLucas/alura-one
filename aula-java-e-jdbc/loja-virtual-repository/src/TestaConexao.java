import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        System.out.println("Abrindo conexão MySQL");
        Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");

        System.out.println("Fechando conexão MySQL");
        con.close();
    }
}