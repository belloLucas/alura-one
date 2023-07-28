package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(1111, 2222);
        guardador.adicionar(cc);

        Conta cc1 = new ContaCorrente(1212, 1313);
        guardador.adicionar(cc1);


        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println("Espaços usados no array: " + tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref);
    }

}
