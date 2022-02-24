
public class question1 {
    public static void main(String[] args) {
        //using Thread class
        Thread1 th=new Thread1();
        th.start();
        try{
            th.join();
        }catch (Exception e){
            System.out.println("Caught exception");
        }


        //using Runnable
        new Thread(new Thread2()).start();

        //Anonymous Class
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Hello i'm here");
            }
        }).start();

        //Lambda
        new Thread(() -> System.out.println("I'm lambda")).start();



    }
}
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}

class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("i'm in implement Runnable");
        }
    }
}
