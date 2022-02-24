/*
Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of
tasks and wait for completion of all tasks.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



class ThreadExecutor extends Thread
{
    static int threadNumber=0;

    @Override
    public void run()
    {
        System.out.println(threadNumber+" : ThreadExecutor got invoked at: ");

        try{
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println(threadNumber+" : ThreadExecutor got executed successfully at: ");
    }
}

public class question2 {
    public static void main(String args[])
    {
        //A single thread pool can be obtainted by calling the static newSingleThreadExecutor() method of Executors class.
        ExecutorService singleThreadExecutor= Executors.newSingleThreadExecutor();

        /*
        CachedThreadPool creates as many threads it needs to execute the task in parrallel.
        The old available threads will be reused for the new tasks.
         */
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        //It is a thread pool with fixed number of threads.
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        try {

            singleThreadExecutor.submit(new ThreadExecutor());

            cachedThreadPool.submit(new ThreadExecutor());
            cachedThreadPool.submit(new ThreadExecutor());
            cachedThreadPool.submit(new ThreadExecutor());

            fixedThreadPool.submit(new ThreadExecutor());
            fixedThreadPool.submit(new ThreadExecutor());
            fixedThreadPool.submit(new ThreadExecutor());
            fixedThreadPool.submit(new ThreadExecutor());



            singleThreadExecutor.shutdown();
            singleThreadExecutor.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Shutdown singleThreadExecutor");


            cachedThreadPool.shutdown();
            cachedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Shutdown cachedThreadPool");


            fixedThreadPool.shutdown();
            fixedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Shutdown fixedThreadPool");


        } catch (InterruptedException e) {
            System.err.println("Exception Occured");
            e.printStackTrace();
        }

    }
}

