package trab03;

public class Context {

    private char op;
    private State stt;

    public Context() {
        this.stt = new S1();
    }
    
    public State getStt() {
        return this.stt;
    }

    public void setStt(State stt) {
        this.stt = stt;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
        this.stt.update(this);
    }
}
