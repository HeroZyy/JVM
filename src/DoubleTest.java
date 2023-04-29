public class DoubleTest {
    private volatile static DoubleTest doubleTest;
    private DoubleTest(){}
    public static DoubleTest getInstance(){
        if(doubleTest == null) {
            synchronized(DoubleTest.class) {
                if(doubleTest == null) {
                    doubleTest = new DoubleTest();
                }
            }
        }
        return doubleTest;
    }
}
