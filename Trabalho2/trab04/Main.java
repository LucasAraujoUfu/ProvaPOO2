package trab04;

public class Main {
    public static void main(String[] args) {
        Fabrica2D fabrica2 = new Fabrica2D();
        Fabrica3D fabrica3 = new Fabrica3D();
        
        Prato p = fabrica2.fabricarPrato();
        System.out.println(p.getClass());
        
        p = fabrica3.fabricarPrato();
        System.out.println(p.getClass());
        
        Copo c = fabrica2.fabricarCopo();
        System.out.println(c.getClass());
        
        c = fabrica3.fabricarCopo();
        System.out.println(c.getClass());
        
        Garrafa g = fabrica2.fabricarGarrafa();
        System.out.println(g.getClass());
        
        g = fabrica3.fabricarGarrafa();
        System.out.println(g.getClass());
    }
}
