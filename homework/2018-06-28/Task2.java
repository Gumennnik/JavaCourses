public class Task2 {
        //создаём число
        // Определяем количество знаков
        // если знаков 3 - сигналим.
        // определяем, является ли его последняя цифра семёркой
        // Определите, является ли число чётным.
        public static void run(int number)
        {
            NumberSaving a = new NumberSaving(number);
            a.isThreeDigets();
            a.islastIsSeven();
            a.isDividableByTwo();


            return;

        }

}
