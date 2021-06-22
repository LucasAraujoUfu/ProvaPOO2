package trab02;

import java.util.*;

public class Ponto2dFactory {
    
    public static Ponto2d fabricar(){
       Random r = new Random();
       return new Ponto2d(r.nextInt(),r.nextInt());
    }
    
}
