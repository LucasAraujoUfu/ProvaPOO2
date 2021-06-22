package trab04;

public class Dimencao extends Decorator{       

    public Dimencao(Component comp,int d) {
        super(comp);
        super.setDescricao(", com "+d+" Dimencoes");
    }
    
}  
