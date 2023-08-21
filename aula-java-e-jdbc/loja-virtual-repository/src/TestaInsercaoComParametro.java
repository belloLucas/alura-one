import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        con.setAutoCommit(false);

        try{
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO PRODUTO(nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

            adicionarVariavel("SmartTV", "45 polegadas", stm);
            adicionarVariavel("Radio", "Radio de bateria", stm);

            con.commit();

            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Rollback foi executado: " + ex);
            con.rollback();
        }

    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        if(nome.equals("Radio")) {
            throw new RuntimeException("Não foi possível adicionar o produto");
        }

        stm.execute();
        ResultSet set = stm.getGeneratedKeys();

        while(set.next()){
            Integer id = set.getInt(1);
            System.out.println(id);
        }

        set.close();
    }
}
