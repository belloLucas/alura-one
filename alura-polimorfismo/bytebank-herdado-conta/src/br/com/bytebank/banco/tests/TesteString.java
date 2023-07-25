package br.com.bytebank.banco.tests;

public class TesteString {
    public static void main(String[] args) {

        String strVazio = "";

        boolean isEmpty = strVazio.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        String nome = "Lucas";

        String nomeAlterado = nome.replace("L", "l");
        System.out.println("Replace: " + nomeAlterado);

        String nomeLower = nome.toLowerCase();
        System.out.println("toLowerCase: " + nomeLower);

        String subString = nome.substring(1);
        System.out.println("subString: " + subString);

        char charAt = nome.charAt(0);
        System.out.println("charAt: " + charAt);

        int indexOf = nome.indexOf("a");
        System.out.println("indexOf: " + indexOf);

        int length = nome.length();
        System.out.println("length: " + length);
        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
