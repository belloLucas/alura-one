public class SistemaInterno {

    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autenticacao(this.senha);
        if (autenticou) {
            System.out.println("Autenticação realizada com sucesso!");
        } else {
            System.out.println("Autenticação negada.");
        }
    }
}
