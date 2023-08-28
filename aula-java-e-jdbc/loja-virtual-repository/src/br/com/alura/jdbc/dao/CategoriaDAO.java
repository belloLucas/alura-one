package br.com.alura.jdbc.dao;

import br.com.alura.jdbc.modelo.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private final Connection connection;

    public CategoriaDAO(Connection con) {
        this.connection = con;
    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<Categoria>();

        String sql = "SELECT ID, NOME FROM CATEGORIA";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rst = pstm.getResultSet()) {
                while(rst.next()){
                    Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));
                    categorias.add(categoria);
                }
            }
        }

        return categorias;
    }
}
