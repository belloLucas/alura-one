public class TesteConexao {
    public static void main(String[] args) {

        /* ============ Código de menor complexidade ============ */
        try ( Conexao conexao = new Conexao() ) {
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro durante a conexão.");
        }


        /*
        ============ Código de maior complexidade ============
        Conexao cx = null;
        try {
            cx = new Conexao();
            cx.leDados();
        } catch(Exception ex) {
            System.out.println("Ocorreu um erro durante a conexão.");
        } finally {
            if(cx != null) {
                cx.close();
            }
        }
         */
    }
}
