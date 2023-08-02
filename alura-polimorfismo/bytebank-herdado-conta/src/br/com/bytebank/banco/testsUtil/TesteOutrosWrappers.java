package br.com.bytebank.banco.testsUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(21); //Neste trecho o java faz o Autoboxing
        System.out.println(idadeRef.intValue()); //Este trecho realiza o Unboxing

        Double dref = Double.valueOf(3.2);
        System.out.println(dref.doubleValue());

        List<Number> numeros = new ArrayList<Number>();
        numeros.add(21);
        numeros.add(31.2f);
        numeros.add(3.20);
    }
}
