package br.com.bytebank.banco.testsUtil;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        int idade = 21;
        Integer idadeRef = Integer.valueOf(21); //Neste trecho o java faz o Autoboxing
        Integer idadeValor = idadeRef.intValue(); //Este trecho realiza o Unboxing

        String string = args[0];
        int numero = Integer.parseInt(string); //Método da classe Integer que transforma um valor em um int, muito usado de String para Int
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(21);
    }
}
