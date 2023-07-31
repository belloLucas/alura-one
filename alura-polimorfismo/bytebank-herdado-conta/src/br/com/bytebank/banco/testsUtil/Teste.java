package br.com.bytebank.banco.testsUtil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(1111, 2222);
        lista.add(cc);

        Conta cc1 = new ContaCorrente(1212, 1313);
        lista.add(cc1);

        System.out.println("Tamanho da lista: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getAgencia());

        lista.remove(0);
        System.out.println("Tamanho da lista: " + lista.size());

        Conta cc2 = new ContaCorrente(1345, 3469);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(4311, 6099);
        lista.add(cc3);

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
