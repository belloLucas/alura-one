public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do gerente:");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticacao(int senha) {
        if(this.senha == senha) {
            return true;
        }
        else {
            return false;
        }
    }
}
