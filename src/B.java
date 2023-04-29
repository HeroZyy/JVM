public class B extends D{
    public static int num =5;
    public int id = 2;
    B(){
//        System.out.println(1);
        num = super.protectGetNum();
    }
    @Override
    public int getNum() {
        return num;
    }
}
