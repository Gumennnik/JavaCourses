public class Task2 {
        //создаём число
        // Определяем количество знаков
        // если знаков 3 - сигналим.
        // определяем, является ли его последняя цифра семёркой
        // Определите, является ли число чётным.


        public static void run(int number)
        {
            String newLine = System.getProperty("line.separator");
            System.out.println("Started task 2" + newLine);

            NumberSaving a = new NumberSaving(number);
            System.out.println("Current number is " + a.getTargenNumber());
            a.isThreeDigets();
            a.islastIsSeven();
            a.isDividableByTwo();
            System.out.println(newLine);

            return;

        }

}
