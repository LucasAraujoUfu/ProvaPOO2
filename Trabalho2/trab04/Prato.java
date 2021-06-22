package trab04;

public interface Prato {
    public abstract void encher();
    public abstract void esvaziar();
    
    public abstract boolean cheio();
    
    public abstract void setMaterial(String material);
    public abstract String getMaterial();
}
