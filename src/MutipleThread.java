public class MutipleThread {
    private static final Object lock = new Object();
    private static volatile int count = 1;
    private static volatile int current = 1;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            synchronized (lock){
                while (count < 10){
                    if(current % 3 == 1) {
                        current++;
                        System.out.print('A');
                        lock.notifyAll();
                    }
                    else{
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (lock){
                while (count < 10){
                    if(current % 3 == 2) {
                        current++;
                        System.out.print('B');
                        lock.notifyAll();
                    }
                    else{
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t3 = new Thread(()->{
            synchronized (lock){
                while (count < 10){
                    if(current % 3 == 0) {
                        current = 1;
                        System.out.println('C');
                        lock.notifyAll();
                        count++;
                    }
                    else{
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        System.out.println("输出完毕");
    }
}
