public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno s = new SistemaInterno();
        s.autentica(g);
        s.autentica(adm);
        s.autentica(cliente);
    }
}
