import java.sql.SQLOutput;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é de: " + total);
        System.out.println("Criando a conta de número: " + this.numero);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
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
}
