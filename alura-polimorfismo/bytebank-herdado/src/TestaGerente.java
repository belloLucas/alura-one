public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Lucas");
        g1.setCpf("123.456.789-10");
        g1.setSalario(6550);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());

        g1.setSenha(2943);
        boolean auth = g1.autenticacao(2943);
        System.out.println(auth);
        System.out.println("==========");
    }
}
