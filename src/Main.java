public class Main {
    public static void fun(A a){
        a.id = 1;
//        A.fun(a,1);
    }
    public static void funAdd(Integer a){
        a = 2;
//        A.fun(a,1);
        System.out.println("a = " + a);
    }
    public static void funStringBuffer(int [] a){
    a[0] = 2;
        //        A.fun(a,1);
//        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));
        String a = "123";
        String b = "123";
        String c = new String("123");
        String d = new String("123");
        System.out.println("(a==b) = " + (a == b));
        System.out.println("(a==c) = " + (a == c));
        System.out.println("(c==d) = " + (c == d));
        System.out.println("a.equals(c) = " + a.equals(c));
    }
}
