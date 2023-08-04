package br.com.bytebank.banco.testsUtil;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoDeContas {
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

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(comparator);

        for(Object o : lista){
            System.out.println(o);
        }
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getNumero() < c2.getNumero()) return -1;
        if(c1.getNumero() > c2.getNumero()) return 1;
        return 0;
    }
}
