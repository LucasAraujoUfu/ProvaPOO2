package trab01;

import java.util.Random;

public class ComandoCondicional extends Comando{
    private Comando _if;
    private Comando _else;

    public ComandoCondicional(Comando _if, Comando _else) {
        this._if = _if;
        this._else = _else;
    }
    
    public Comando getIf() {
        return _if;
    }

    public void setIf(Comando _if) {
        this._if = _if;
    }

    public Comando getElse() {
        return _else;
    }

    public void setElse(Comando _else) {
        this._else = _else;
    }

    @Override
    public void execute() {
        Random r = new Random();
        if(r.nextDouble()>=.5){
            _if.execute();
        }
        else{
            _else.execute();
        }
    }
    
}
