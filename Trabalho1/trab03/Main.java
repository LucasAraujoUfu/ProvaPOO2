package trab03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context c = new Context();
        String str;
        str = sc.next();
        
        for (int i = 0;i<str.length();i++)c.setOp(str.charAt(i));
        
        if (c.getStt().getClass() == S4.class)
            System.out.println("A sequencia "+str+" eh valida");
            
        else
            System.out.println("A sequencia "+str+" nao eh valida");
    }
    
}
