package br.com.bytebank.banco.testsUtil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

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
