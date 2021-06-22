package trab04;

public class Main {
    
    public static void main(String[] args) {
        Component f = new Figura("Circulo");
        f = new Dimencao(f,2);
        f = new Cor(f,"azul");
        System.out.println(f.desenhar());
    }
    
}
