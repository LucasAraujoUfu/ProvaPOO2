package trab04;

public class Cor extends Decorator{

    public Cor(Component comp,String c) {
        super(comp);
        super.setDescricao(", "+c);
    }
    
}
