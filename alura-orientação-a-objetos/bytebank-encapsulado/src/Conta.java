public class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //Esse atributo é do tipo Cliente (classe) e faz referência a essa classe Cliente.
    private static int total;

    public Conta(int agencia, int numero) {
        if(agencia <= 0 || numero <= 0){
            System.out.println("Número da agência ou conta não podem ser menor ou iguais a zero.");
            return;
        }
        Conta.total++;
        System.out.println("Total de contas abertas: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferência realizada para " + destino + " no valor de " + valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        //Métodos set tendem a não retornar nada, portanto são void
        //Dentro de getters e setters podemos fazer verificações.
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}