public class hungry {
    private static final hungry hun = new hungry();
    //饿汉模式为什么要用私有构造函数
    private hungry(){}
//    public hungry(){}
    public static hungry getInstance(){
        return hun;
    }
}
