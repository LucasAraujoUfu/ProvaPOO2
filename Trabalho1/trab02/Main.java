package trab02;

public class Main {
    public static void main(String[] args) {
        
        Subject acoes = new Subject();

        Observer o[] = new HomeBroker[5];
        
        for(int i=0;i<5;i++)
            o[i] = new HomeBroker();

        for(int i=0;i<5;i++)
            acoes.registerObserver(o[i]);

        acoes.setVal("Marvel: 1800.00\nPixar: 1225.00\n");
        acoes.setVal("Marvel: 2000.00\nPixar: 1500.00\n");

    }
}
