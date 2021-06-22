package trab02;

public class HomeBroker implements Observer{
    
    @Override
    public void Imprimir(Subject subject){
        System.out.println(subject.getVal());
    }
    
}
