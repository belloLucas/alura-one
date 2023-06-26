public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        if (idade >= 18) {
            System.out.println("A idade é igual ou maior que 18 anos.");
        } else if (quantidadePessoas >= 2) {
            System.out.println("Você não possui idade igual ou superior a 18 anos, mas pode entrar por estar acompanhado.");
        } else {
            System.out.println("A idade é menor que 18 anos");
        }
    }
}
