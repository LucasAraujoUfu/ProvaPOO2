package trab04;

public class Fabrica2D {
    
    Copo fabricarCopo(){
        return new Copo2D();
    }
    
    Prato fabricarPrato(){
       return new Prato2D();
    }
    
    Garrafa fabricarGarrafa(){
        return new Garrafa2D();
    }
    
}
