package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.vo.RelatorioDeVendasVO;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class PedidoDAO {
    private EntityManager em;

    public PedidoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido) {
        this.em.persist(pedido);
    }

    public BigDecimal valorTotalVendido() {
        String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
        return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }

    //Meio "errado" de fazer esse método funcionar, retornando uma lista com arrays de objetos
//    public List<Object[]> relatorioDeVendas () {
//        String jpql = "SELECT produto.nome, " +
//                "SUM(item.quantidade), "
//                + "MAX(pedido.data) "
//                +" FROM Pedido pedido "
//                + "JOIN pedido.itens item "
//                + "JOIN item.produto produto "
//                + "GROUP BY produto.nome "
//                + "ORDER BY item.quantidade DESC";
//        return em.createQuery(jpql, Object[].class)
//                .getResultList();
//    }

    public List<RelatorioDeVendasVO> relatorioDeVendas () {
        String jpql = "SELECT new br.com.alura.loja.vo.RelatorioDeVendasVO("
        + "produto.nome, "
        + "SUM(item.quantidade), "
        + "MAX(pedido.data)) "
        + "FROM Pedido pedido "
        + "JOIN pedido.itens item "
        + "JOIN item.produto produto "
        + "GROUP BY produto.nome "
        + "ORDER BY item.quantidade DESC";
        return em.createQuery(jpql, RelatorioDeVendasVO.class)
                .getResultList();
    }
}
