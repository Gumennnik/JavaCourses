package classwork;

public class Worker {


    public void dummyWork(){

            try {
//                Thread.cu
            System.out.println(Thread.currentThread().getName() + " workinng...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        return;
    }
}
