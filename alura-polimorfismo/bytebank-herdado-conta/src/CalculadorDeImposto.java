public class CalculadorDeImposto {

    private double totalImposto;

    public void registro(Tributavel t) {
        double valor = t.getValorImpost();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
