package trab01;

public class ComandoSimples extends Comando{

    private String comando;

    public ComandoSimples(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
    
    @Override
    public void execute() {
        System.out.println(this.comando);
    }
    
}
