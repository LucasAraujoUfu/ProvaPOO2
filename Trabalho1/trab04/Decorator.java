package trab04;
public class Decorator extends Component {
   
    private Component comp;
    
    
    public Decorator(Component comp){
        super(null);
        this.comp = comp; 
    }
    
   @Override
    public String desenhar() {
        return comp.desenhar()+super.getDescricao();
    }

    public Component getComp() {
        return comp;
    }

    public void setComp(Component comp) {
        this.comp = comp;
    }
   
}
