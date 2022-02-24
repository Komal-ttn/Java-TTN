// 3) Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.

public class question3 {
    private int integer = 0;
    private void increment() {
        try{
            Thread.sleep(10);  //throws Interrupted Exception
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.integer++;
        System.out.println("Integer at incremented method: "+integer);
    }
    private synchronized void decrement() {
        try{
            Thread.sleep(200);      //throws Interrupted Exception
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.integer--;
        System.out.println("Integer at decremented method: "+integer);
    }

    public static void main(String[] args) throws InterruptedException {
        question3 obj = new question3();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized(lock) {
                    obj.increment();
                }
            }
        }, "IncrementThread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (lock) {
                    obj.decrement();
                }
            }
        }, "DecrementThread");
        t1.start();
        t2.start();

        Thread.sleep(5000);
        System.out.println(obj.integer);
    }
}