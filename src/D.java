public abstract class D implements C {
    public int num = 3;
    protected int protectGetNum(){
        return num;
    }
    @Override
    public abstract int getNum();
}
