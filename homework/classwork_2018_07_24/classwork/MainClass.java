package classwork;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainClass {

    private final static Semaphore SEMAPHORE = new Semaphore(3,true);
    public static void main(String[] args) {

        Supplier<Car> carSupplier = Car::new;
        Consumer<Car> carConsumer = (car -> {
            System.out.println("I'm driving car" + car.getColor()+ " with power " + car.getHorsePower() + "Drin-drin-drin");
        });
        CarUtilize<Car> utilizer = c -> {
            System.out.println(c.getEngine()*700);
            return c.getEngine()*700;
        };
        Car car = new Car();
        car.setEngine(200.0);
        utilizer.utilize(car);
        int b = 2 + (new Random()).nextInt();
        System.out.println(Locale.getDefault());

        return;
//        for (int i = 0; i < 10 ; i++) {
//            Worker worker = new Worker();
//            new Thread(()->{
//                try {
//
//                    System.out.println(Thread.currentThread().getName() + " come to semaphore");
//                    SEMAPHORE.acquire();
//                    System.out.println(Thread.currentThread().getName() + " acquire semaphore semaphore");
//                    Thread.sleep(200);
//                    for (int j = 0; j < 5; j++) {
//                        worker.dummyWork();
//                        Thread.sleep(200);
//                    }
//                    System.out.println(Thread.currentThread().getName() + " releasing semaphore");
//                    SEMAPHORE.release();
//                    System.out.println(Thread.currentThread().getName() + " released semaphore");
//
//                }catch (Exception e)
//                {
//                    e.printStackTrace();
//                }
//            }).start();




    }


}
