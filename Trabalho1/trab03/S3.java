package trab03;

public class S3 implements State {

    @Override
    public void update(Context c) {
        if(c.getOp()=='a')c.setStt(new S1());
        else if(c.getOp()=='b')c.setStt(new S4());
    }
}
