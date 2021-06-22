package trab02;

public class Main {

    public static void main(String[] args) {
        Ponto2dFactory fabrica = new Ponto2dFactory(); 
        Ponto2d p = fabrica.fabricar();
        
        System.out.printf("(x = %d, y = %d)\n",p.x,p.y);
    }
    
}
