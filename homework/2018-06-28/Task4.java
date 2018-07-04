import java.util.Random;

public class Task4 {
        public static void run()
        {
            //получаем случайное число
            //выводим в виде текста с правильным падежом "рублей"
            Random rand = new Random();
            int a = 1 + rand.nextInt(100);
            MoneyAnswerer b = new MoneyAnswerer(a);
            System.out.println(b.toString());
            return;
        }
}
