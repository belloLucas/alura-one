public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoLucas = new Conta();
        contaDoLucas.saldo = 100;
        contaDoLucas.deposita(250);
        System.out.println(contaDoLucas.saldo);

        boolean conseguiuSacar = contaDoLucas.saca(400);
        System.out.println(contaDoLucas.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaLaura = new Conta();
        contaDaLaura.deposita(1000);

        if(contaDaLaura.transfere(300, contaDoLucas)){
            System.out.println("Saldo atual conta Lucas: " + contaDaLaura.saldo);
            System.out.println("Saldo atual conta Laura: " + contaDoLucas.saldo);
        } else {
            System.out.println("Transferência não realizada.");
        }
    }
}
