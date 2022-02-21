//Q3)Create a thread using lambda function

/*
Java has Runnable as one of Built-in Functional Interfaces
Runnable –> This interface only contains the run() method.
 */

public class question3 {
    public static void main(String[] args) {
        //normal way to use runnable
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello i am old version");
            }
        });
        //runnable through lambda
        Runnable thread2=()->
            System.out.println("Hello you used me through Lambda");

        thread1.start();
       /* Thread t2=new Thread(thread2);
        t2.start();*/
       new Thread(thread2).start();
      //  thread2.run();
    }
}


