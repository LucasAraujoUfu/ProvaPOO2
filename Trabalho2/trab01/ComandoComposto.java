package trab01;

import java.util.ArrayList;
import java.util.List;

public class ComandoComposto extends Comando{
    private List<Comando> comandos;

    public ComandoComposto() {
        comandos = new ArrayList<>();
    }
    
    public void adicionaComando(Comando c){
        this.comandos.add(c);
    }

    public List<Comando> getComandos() {
        return comandos;
    }

    public void setComandos(List<Comando> comandos) {
        this.comandos = comandos;
    }

    @Override
    public void execute() {
        this.comandos.forEach((i) -> {
            i.execute();
        });
    }

}
