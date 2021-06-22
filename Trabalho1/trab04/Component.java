package trab04;

public abstract class Component {
   
    private String descricao;
    
    public abstract String desenhar();

    public Component(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
   
}
