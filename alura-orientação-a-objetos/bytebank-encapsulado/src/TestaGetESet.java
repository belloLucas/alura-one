public class TestaGetESet {
    public static void main(String[] args) {
        //Criando conta e populando classe
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println("Número: " + conta.getNumero());

        conta.setAgencia(1010);
        System.out.println("Agência: " + conta.getAgencia());

        //Criando cliente e referenciando cliente a conta
        Cliente lucas = new Cliente();
        conta.setTitular(lucas);
        System.out.println("Titular: " + conta.getTitular());

        //Populando classe cliente
        lucas.setNome("Lucas Bello");
        lucas.setCpf("123.456.789-10");
        lucas.setProfissao("Desenvolvedor");

        System.out.println("Nome: " + lucas.getNome());
        System.out.println("CPF: " + lucas.getCpf());
        System.out.println("Profissão: " + lucas.getProfissao());

        //Outra forma de acessar esses atributos, direto do objeto conta
        System.out.println("Nome: " + conta.getTitular().getNome());
        System.out.println("CPF: " + conta.getTitular().getCpf());
        System.out.println("Profissão: " + conta.getTitular().getProfissao());

    }
}
