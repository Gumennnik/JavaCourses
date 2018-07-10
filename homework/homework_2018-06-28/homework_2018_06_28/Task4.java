package homework_2018_06_28;

import java.util.Random;

public class Task4 {
        public static void run()
        {

            //получаем случайное число
            //выводим в виде текста с правильным падежом "рублей"

            String newLine = System.getProperty("line.separator");
            System.out.println("Starting task 4 " + newLine);

            Random rand = new Random();
            int a = 1 + rand.nextInt(20);
            MoneyAnswerer b = new MoneyAnswerer(a);
            System.out.println(b.toString() + newLine);


            return;
        }
}
