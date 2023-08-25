package br.com.alura.jdbc.dao;

import br.com.alura.jdbc.modelo.Produto;

import java.sql.*;

public class ProdutoDAO {
    private Connection con;
    public ProdutoDAO(Connection connection) {
        this.con = connection;
    }

    public void salvar(Produto produto) throws SQLException {
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?, ?)";

        try(PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()) {
                while(rst.next()){
                    produto.setId(rst.getInt(1));
                }
            }
        }
    }
}
