package trab01;

public class Venda {

    private Venda next;
    private int cod;
    private int qtd;
    private double val;
    private boolean vendido;

    private static int q = 1;

    public Venda(int qtd, double val) {
        this.next = null;
        this.cod = q;
        q++;
        this.qtd = qtd;
        this.val = val;
        this.vendido = false;
    }

    public Venda comprar(Compra c) {
        if (c.getQtd() >= this.qtd && this.val <= c.getVal()) {
            this.vendido = true;
            return this;
        }
        else {
            Venda aux = this.next;
            Venda ant = this;
            while (aux!=null) {
                if (c.getQtd() == aux.getQtd() && aux.getVal() <= c.getVal()) {
                    aux.setVendido(true);
                    ant.setNext(aux.getNext());
                    aux.setNext(null);
                    break;
                }
                ant = aux;
                aux = aux.getNext();
            }
            return aux;
        }
    }

    public void addVenda(Venda venda) {
        if (this.next == null) {
            this.next = venda;
        } else {
            this.next.addVenda(venda);
        }
    }

    public boolean getVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public Venda getNext() {
        return next;
    }

    public void setNext(Venda next) {
        this.next = next;
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
