public class TestaBanco {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas Bello";
        lucas.cpf = "123.456.789-10";
        lucas.profissao = "Programador";

        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(100);

        contaDoLucas.titular = lucas;
        System.out.println(contaDoLucas.titular.nome);
        System.out.println(contaDoLucas.titular.cpf);
        System.out.println(contaDoLucas.titular.profissao);
    }
}
