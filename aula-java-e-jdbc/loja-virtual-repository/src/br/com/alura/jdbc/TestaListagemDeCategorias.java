package br.com.alura.jdbc;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategorias {
    public static void main(String[] args) throws SQLException {

        try(Connection con = new ConnectionFactory().recuperarConexao()) {
            CategoriaDAO categoriaDAO = new CategoriaDAO(con);
            List<Categoria> listaDeCategoria = categoriaDAO.listarComProdutos();

            listaDeCategoria.stream().forEach(ct -> {
                System.out.println(ct.getNome());
                for(Produto produto : ct.getProdutos()) {
                    System.out.println(ct.getNome() + " - " + produto.getNome());
                }
            });
        }
    }
}
