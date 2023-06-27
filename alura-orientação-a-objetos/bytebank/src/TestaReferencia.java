public class TestaReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 400;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 300;
        System.out.println("Salgo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("As contas são iguais. Referência 1ª conta: " + primeiraConta + " Referência segunda conta: " + segundaConta);
        }
    }
}
