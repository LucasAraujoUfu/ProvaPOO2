package trab04;

public class Prato2D extends Objeto2D implements Prato{

    private String material;
    private boolean cheio;

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
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
