public class EditorVideo extends Funcionario{
    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do editor:");
        return super.getBonificacao() + 100;
    }
}
