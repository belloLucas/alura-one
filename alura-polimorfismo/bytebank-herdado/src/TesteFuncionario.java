public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Lucas Bello");
        funcionario.setCpf("123.456.789-10");
        funcionario.setSalario(1345.50);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getBonificacao());
    }
}
