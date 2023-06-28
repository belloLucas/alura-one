public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());

        Conta conta2 = new Conta(1337, 15896);
        Conta conta3 = new Conta(1337, 29185);

        System.out.println(Conta.getTotal());
    }
}
