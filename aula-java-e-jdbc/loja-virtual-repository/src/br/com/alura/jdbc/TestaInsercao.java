package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("INSERT INTO PRODUTO(nome, descricao) VALUES ('Mouse', 'Mouse sem frio')", Statement.RETURN_GENERATED_KEYS);
        ResultSet set = stm.getGeneratedKeys();

        while(set.next()){
            Integer id = set.getInt(1);
            System.out.println(id);
        }

        con.close();
    }
}
