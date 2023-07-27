package br.com.bytebank.banco.tests;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int[] idade = new int[5];

        for(int i = 0; i < idade.length; i++){
            idade[i] = i * i;
            System.out.println("Idade: "+ idade[i] + " anos.");
        }
    }
}
