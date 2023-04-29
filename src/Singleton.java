public class Singleton {
    public static void main(String[] args) {
//        hungry hun1 = hungry.getInstance();
//        hungry hun2= hungry.getInstance();
//        System.out.println(hun1 == hun2);
//        FullMan full1 = FullMan.getInstance();
//        FullMan full2 = FullMan.getInstance();
//        System.out.println(full1 == full2);
        DoubleTest d1 = DoubleTest.getInstance();
        DoubleTest d2 = DoubleTest.getInstance();
        System.out.println(d1 == d2);
    }
}
