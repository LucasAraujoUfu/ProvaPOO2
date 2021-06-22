package trab03;

import java.util.*;

public class Ponto2dFactory{

    private static Ponto2dFactory singleton;

    private Ponto2dFactory(){}

    public static synchronized Ponto2dFactory getInstance() {
        if (singleton == null) {
            singleton = new Ponto2dFactory();
        }
        return singleton;
    }

    public Ponto2d fabricar() {
        Random r = new Random();
        return new Ponto2d(r.nextInt(), r.nextInt());
    }

}
