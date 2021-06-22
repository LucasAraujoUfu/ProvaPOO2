package trab04;

public class Garrafa2D extends Objeto2D implements Garrafa{

    private float capacidade;
    private boolean cheio;
    
    @Override
    public float getCapacidade() {
        return capacidade;
    }

    @Override
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public void encher() {
        cheio = true;
    }

    @Override
    public void esvaziar() {
        cheio = false;
    }

    @Override
    public boolean cheio() {
        return cheio;
    }
    
}
