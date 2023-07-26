package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {
//        System.out.println("x");
//        System.out.println(10);
//        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(111, 111);
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        Cliente cliente = new Cliente();


        System.out.println(cc);
        System.out.println(cp);
        System.out.println(cliente);

//        println(cc);
//        println(cp);
//        println(cliente);
    }

    static void println(Object obj){

    }
}
