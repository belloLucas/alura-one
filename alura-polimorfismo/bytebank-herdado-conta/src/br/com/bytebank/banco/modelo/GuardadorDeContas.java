package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Conta getReferencia(int ref) {
        return referencias[ref];
    }
}
