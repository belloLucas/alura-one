import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        String nome = "Mouse'";
        String descricao = "Mouse sem fio); delete from Produto;";

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        PreparedStatement stm = con.prepareStatement(
                "INSERT INTO PRODUTO(nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();
        ResultSet set = stm.getGeneratedKeys();

        while(set.next()){
            Integer id = set.getInt(1);
            System.out.println(id);
        }

        con.close();
    }
}
