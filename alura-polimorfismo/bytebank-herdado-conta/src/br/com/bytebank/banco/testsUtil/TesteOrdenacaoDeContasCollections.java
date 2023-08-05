package br.com.bytebank.banco.testsUtil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacaoDeContasCollections {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaCorrente(22, 44);
        cc2.deposita(444);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("=-=-=-= Lista antes da ordenação =-=-=-=-");
        for(Object o : lista){
            System.out.println(o);
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("=-=-=-=- Lista após a ordenação =-=-=-=-=");

        Collections.sort(lista);

        for(Object o : lista){
            System.out.println(o);
        }
    }
}