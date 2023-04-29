import java.util.Objects;

public class A extends B{
    int num;
    String name;
    A(){
//        继承
//        System.out.println();
//        System.out.println("super.id = " + super.id);
//        System.out.println(super.getNum());
//        System.out.println("super.getNum() = " + super.getNum());
    }
    public static void fun(A a , int num){
        a.id = num;
    }
    //重写equals方法
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
//        另一种写法
//        if(!(obj instanceof A)) return false;
        A a = (A) obj;
        return a.num == this.num && Objects.equals(a.name ,this.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
    public static void main(String[] args) {
        System.out.println(B.num);
//        静态方法内，子类不能调用父类实例数据
//        System.out.println(super.id);
    }
}
