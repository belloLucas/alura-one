public class Gerente extends FuncionarioAutenticavel {
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do gerente:");
        return super.getSalario();
    }
}
