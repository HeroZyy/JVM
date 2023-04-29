public class TwoThread {
        private int count = 0;

        public synchronized void increment() {
            System.out.println("Thread " + Thread.currentThread().getName() + " enter increment.");
            count++;
            System.out.println("Thread " + Thread.currentThread().getName() + " leave increment.");
        }

        public synchronized int getCount() {
            System.out.println("Thread " + Thread.currentThread().getName() + " enter getCount.");
            int currentCount = count;
            System.out.println("Thread " + Thread.currentThread().getName() + " leave getCount.");
            return currentCount;
        }

        public static void main(String[] args) {
            final TwoThread demo = new TwoThread();

            Thread threadA = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    demo.increment();
                }
            });

            Thread threadB = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    int currentCount = demo.getCount();
                    System.out.println("Thread " + Thread.currentThread().getName() + " get count: " + currentCount);
                }
            });

            threadA.start();
            threadB.start();
        }
    }
