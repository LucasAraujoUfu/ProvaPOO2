package trab01;

public class Transacao {
    
    private Venda lista;
    
    public void newVenda(int qtd, double val){
        if(lista==null)lista = new Venda(qtd,val);
        else lista.addVenda(new Venda(qtd,val));
    }
    
    public Venda newCompra(Compra c){
        if(lista==null)return null;
        else{ 
            Venda temp = lista.comprar(c);
            if(lista.getVendido())lista=lista.getNext();
            return temp;
        }
    }
    
}
