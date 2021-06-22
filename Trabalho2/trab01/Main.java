package trab01;

public class Main {
    public static void main(String[] args) {
        ComandoComposto main = new ComandoComposto();
        main.adicionaComando(new ComandoSimples("Hello, World"));
        main.adicionaComando(new ComandoCondicional(new ComandoSimples("True"),new ComandoSimples("False")));
        main.adicionaComando(new ComandoSimples("EOF"));
        main.execute();
    }
}
