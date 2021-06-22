package trab04;
public class Figura extends Component {
    
    @Override
    public String desenhar() {
        return super.getDescricao();
    }
    
    public Figura(String descricao) {
        super(descricao);
    }
    
}
