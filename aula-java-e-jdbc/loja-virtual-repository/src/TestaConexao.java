import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        System.out.println("Abrindo conexão MySQL");
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        System.out.println("Fechando conexão MySQL");
        con.close();
    }
}
