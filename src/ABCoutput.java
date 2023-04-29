public class ABCoutput {
    private static final Object lock = new Object();
    public static int count = 0;
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintTask(lock,"A",0));
        Thread threadB = new Thread(new PrintTask(lock,"B",1));
        Thread threadC = new Thread(new PrintTask(lock,"C",2));
        Thread D = new Thread(()->{
            synchronized (lock){
                while(true) {
                    if (count > 32) {
                        System.out.println("运行完毕");
                        break;
                    } else {
                        try {
//                            System.out.println(count);
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                }
        });
        threadA.start();
        threadB.start();
        threadC.start();
        D.start();
    }

    static class PrintTask implements Runnable {
        private final Object lock;
        String name;
        int id;
        PrintTask(Object lock, String name, int id){
            this.lock = lock;
            this.name = name;
            this.id = id;
        }
        @Override
        public void run() {
            synchronized (lock){
                while(count <= 30){
                    while(count % 3 != id) {
                        try{
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(name);
                    count++;
                    lock.notifyAll();
//                    System.out.print(count);
                }
            }
        }
    }
}
