package classwork;

import java.util.concurrent.Semaphore;

public class MainClass {

    private final static Semaphore SEMAPHORE = new Semaphore(3,true);
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            Worker worker = new Worker();
            new Thread(()->{
                try {

                    System.out.println(Thread.currentThread().getName() + " come to semaphore");
                    SEMAPHORE.acquire();
                    System.out.println(Thread.currentThread().getName() + " acquire semaphore semaphore");
                    Thread.sleep(200);
                    for (int j = 0; j < 5; j++) {
                        worker.dummyWork();
                        Thread.sleep(200);
                    }
                    System.out.println(Thread.currentThread().getName() + " releasing semaphore");
                    SEMAPHORE.release();
                    System.out.println(Thread.currentThread().getName() + " released semaphore");

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }).start();




        }



    }


}
