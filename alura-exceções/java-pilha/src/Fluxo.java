public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do método main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String msg = ex.getMessage();
            System.out.println("Ocorreu um erro: " + msg);
        }
        System.out.println("Fim do método main");
    }

    private static void metodo1() {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("Fim do método1");
    }

    private static void metodo2() {
        System.out.println("Início do método2");
        throw new MinhaExcecao("deu ruim amigão");
//        System.out.println("Fim do método2");
    }
}
