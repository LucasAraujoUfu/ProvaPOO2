package trab01;

public class Compra {
    
    private int cod;
    private int qtd;
    private double val;
    
    private static int q = 1;

    public Compra() {
    }
    
    public Compra(int qtd, double val) {
        this.qtd = qtd;
        this.val = val;
        this.cod = q;
        q++;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

}
