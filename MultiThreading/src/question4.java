import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static sun.awt.X11.XConstants.CurrentTime;

/*
WAP to show usage of Callable and demonstrate how it is different from Runnable
 */
class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm Runnable");
        for(int i=1;i<3;i++) {
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                System.out.println("Exception Caught");
            }
        }
    }
}

class callableExample implements Callable
{

    @Override
    public Integer call() throws Exception {

        Integer duration = Integer.valueOf((int) (Math.random() * 100 * Math.random() *200)) ;
        System.out.println("Thread from Callable example got invoked at: "+ CurrentTime);

        try{
            Thread.sleep(duration);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("Thread from Callable example got executed successfully at: "+ CurrentTime);

        return duration;
    }

}


    public class question4 {
        public static void main(String[] args) {
            RunnableDemo rd = new RunnableDemo();
            Thread t1= new Thread(rd);
            System.out.println("Hello");

            callableExample c1= new callableExample();
            ExecutorService executorService= Executors.newFixedThreadPool(2);


            Future<Integer> future=executorService.submit(c1);
            executorService.submit(t1);
            //     executorService.awaitTermination(10, TimeUnit.SECONDS);
            executorService.shutdown();
            System.out.println(future);

        }
}
