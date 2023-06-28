public class Conta{
    private double saldo;
    int agencia;
    int numero;
    Cliente titular; //Esse atributo é do tipo Cliente (classe) e faz referência a essa classe Cliente.

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
}