package br.com.bytebank.banco.testsUtil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(1111, 2222);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(1212, 1313);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(1212, 1313);
        boolean contains = lista.contains(cc3);
        System.out.println("Esse elemento existe na lista?: " + contains);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
