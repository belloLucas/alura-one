package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;

public class TesteArrayDeReferencia {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(1234, 4321);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(1112, 1211);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaCorrente ref1 = (ContaCorrente) referencias[0];
        ContaPoupanca ref2 = (ContaPoupanca) referencias[1];

        System.out.println("Conta de número: " + ref1.getNumero() + " e agência número: " + ref1.getAgencia());
        System.out.println("Conta de número: " + ref2.getNumero() + " e agência número: " + ref2.getAgencia());

        /*
        Doideira
        for (int i = 0; i < referencias.length; i++) {
            referencias[i] = new ContaCorrente(i * i + 1000, i * i + 1500);
            System.out.println(referencias[i]);
        }
        */
    }
}
