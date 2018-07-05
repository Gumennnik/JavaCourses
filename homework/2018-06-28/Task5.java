public class Task5 {
    public static void run(int input)
    {
        String newLine = System.getProperty("line.separator");
        System.out.println("Starting task 5 " + newLine);

        NumberSaving a = new NumberSaving(input);
        System.out.println("Our number is " + a.getTargenNumber());
        a.reverseIfFourNumbersAndSyso();
        System.out.println(newLine);

        return;

    }
}
