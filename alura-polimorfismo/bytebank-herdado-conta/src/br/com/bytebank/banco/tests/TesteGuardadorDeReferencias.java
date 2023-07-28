package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(1111, 2222);
        guardador.adicionar(cc);

        Conta cc1 = new ContaCorrente(1212, 1313);
        guardador.adicionar(cc1);


        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println("Espaços usados no array: " + tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref);
    }

}
