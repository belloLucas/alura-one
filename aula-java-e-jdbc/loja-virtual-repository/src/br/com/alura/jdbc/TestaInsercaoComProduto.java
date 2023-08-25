package br.com.alura.jdbc;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try(Connection con = new ConnectionFactory().recuperarConexao()) {
           ProdutoDAO produtoDAO = new ProdutoDAO(con);
           produtoDAO.salvar(comoda);
        }

        System.out.println(comoda);

    }
}
