package trab03;

public class S2 implements State {

    @Override
    public void update(Context c) {
        switch (c.getOp()) {
            case 'a':
                c.setStt(new S2());
                break;
            case 'b':
                c.setStt(new S1());
                break;
            case 'c':
                c.setStt(new S4());
                break;
            default:
                break;
        }
    }

}
