package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencia {
    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(1234, 4321);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(4567, 7654);
        contas[1] = cc2;

        System.out.println("Conta de número: " + contas[0].getNumero() + " e agência número: " + contas[0].getAgencia());
        System.out.println("Conta de número: " + contas[1].getNumero() + " e agência número: " + contas[1].getAgencia());

        /*
        Doideira
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaCorrente(i * i + 1000, i * i + 1500);
            System.out.println(contas[i]);
        }
        */
    }
}
