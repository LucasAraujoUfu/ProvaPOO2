package trab03;

public class S4 implements State{
    
    @Override
    public void update(Context c) {
        if(c.getOp()=='d')c.setStt(new S3());
    }
    
}
