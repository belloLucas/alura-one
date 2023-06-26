public class TestaVariaveis {
    public static void main(String[] args) {
        System.out.println("Olá novo teste ");

        //Variáveis do tipo INT
        int idade;
        idade = 21;
        System.out.println("A idade é: " + idade + " Anos");

        //Variáveis do tipo DOUBLE (Decimais)
        double salario = 1250.70;
        System.out.println("Meu salário é: R$" + salario);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        //Conversão de tipos (Casting). O Casting consiste em antes de uma atribuição
        // colocar entre aspas o tipo que queremos para aquela conversão
        double salario2 = 1270.50;
        int valor = (int) salario2;
        System.out.println(valor);
    }
}
