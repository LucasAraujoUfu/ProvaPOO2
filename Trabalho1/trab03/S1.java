package trab03;

public class S1 implements State {

    @Override
    public void update(Context c) {
        if(c.getOp()=='a')c.setStt(new S2());
    }

}
