package br.com.bytebank.banco.modelo;

/**
 * Essa classe representa as características básicas de uma conta bancária.
 * @author Lucas Bello
 *
 */

public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Esse construtor serve para inicializar o objeto Conta a partir da agência e número.
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
//        Conta.total++;
//        System.out.println("O total de contas é de: " + total);
//        System.out.println("Criando a conta de número: " + this.numero);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo, caso contrário lançará a exceção de saldo insuficiente.
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ". Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("O número da agência não pode ser 0.");
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("O número da conta não pode ser 0.");
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object ref){

        Conta c = (Conta) ref;

        if(this.agencia != c.agencia){
            return false;
        }

        if (this.numero != c.numero){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }

    @Override
    public String toString() {
        return "Número - " + this.numero + ", Agência - " + this.agencia + ", Saldo - " + this.saldo;
    }
}
