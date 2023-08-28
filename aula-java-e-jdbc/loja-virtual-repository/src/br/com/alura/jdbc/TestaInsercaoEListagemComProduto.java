package br.com.alura.jdbc;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaInsercaoEListagemComProduto {
    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try(Connection con = new ConnectionFactory().recuperarConexao()) {
           ProdutoDAO produtoDAO = new ProdutoDAO(con);
           produtoDAO.salvar(comoda);
            List<Produto> produtoList = produtoDAO.listar();
            produtoList.stream().forEach(lp -> System.out.println(lp));
        }

        System.out.println(comoda);

    }
}
