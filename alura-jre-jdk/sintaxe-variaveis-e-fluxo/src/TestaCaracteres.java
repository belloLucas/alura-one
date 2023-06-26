public class TestaCaracteres {
    public static void main(String[] args) {
        //O char é do tipo int, ele não guarda o caractere necessariamente,
        //Mas sim o unicode do caractere atrelado a ele.
        char letra = 'a';
        System.out.println(letra);

        char valor = 65;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "Lucas Bello Da Silva";
        System.out.println(palavra);

        palavra = palavra + 2023;
        System.out.println(palavra);
    }
}
