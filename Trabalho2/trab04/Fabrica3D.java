package trab04;

public class Fabrica3D {
    
    Copo fabricarCopo(){
        return new Copo3D();
    }
    
    Prato fabricarPrato(){
       return new Prato3D();
    }
    
    Garrafa fabricarGarrafa(){
        return new Garrafa3D();
    }
    
}
