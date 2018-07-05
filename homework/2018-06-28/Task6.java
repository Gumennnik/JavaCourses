public class Task6 {
    public static void run(int input)
    {

        String newLine = System.getProperty("line.separator");
        System.out.println("Starting task 6 " + newLine);
        NumberSaving a = new NumberSaving(input);
        a.allNubersAreDiferent();


        System.out.println(newLine);

        return;
    }
}
