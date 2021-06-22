package trab01;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void clean() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }

    public static void front() throws IOException, InterruptedException {
        clean();
        System.out.println("Qual operação desja realizar?");
        System.out.println("(1)Comprar");
        System.out.println("(2)Vender");
        System.out.println("(0)Sair");
        System.out.print("\nEntre com a operacao: ");
    }

    public static void main(String[] args) {
        int i;
        Transacao t = new Transacao();
        Scanner s = new Scanner(System.in);
        try {
            do {
                int qtd;
                double val;
                front(); 
                i = s.nextInt();
                clean();
                switch (i) {
                    case 1:
                        System.out.print("Qantidades de acoes que deseja comprar: ");
                        qtd=s.nextInt();
                        System.out.print("Valor maximo que deseja pagar: ");
                        val=s.nextDouble();
                        Compra temp = new Compra(qtd,val);
                        Venda v = t.newCompra(temp);
                        if(v==null){
                            System.out.println("Sua compra "+temp.getCod()+" nao foi realizada");
                        }
                        else{
                            System.out.println("Sua compra "+temp.getCod()+" foi realizada com sucesso.");
                            System.out.println("Voce comprou a venda de numero "+v.getCod()+" por R$"+v.getVal());
                        }
                        break;
                    case 2:
                        System.out.print("Quantidades de acoes que deseja vender: ");
                        qtd=s.nextInt();
                        System.out.print("Valor da venda: ");
                        val=s.nextDouble();
                        t.newVenda(qtd, val);
                        System.out.println("Venda adicionada com sucesso.");
                        s.nextLine();
                        break;
                }
            }while(i!=0);
        } 
        catch (IOException | InterruptedException ex) {
            System.out.println("Ocorreu um erro na execucao: " + ex.getMessage());
        }
    }

}
