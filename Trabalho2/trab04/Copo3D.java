package trab04;

public class Copo3D extends Objeto3D implements Copo {

    private boolean cheio;
    
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
