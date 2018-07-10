package homework_2018_06_28;

public class Task3 {

    public static void run(){
        String newLine = System.getProperty("line.separator");

        System.out.println("Starting task 3 " + newLine);

        Geometry a = new Geometry(1,3,2);

        System.out.println("Rectangle parametrs are " + a.getA() + " and " + a.getB() + " , circle radius is " + a.getR());

        System.out.println("Can be closed - " + a.isCanBeRepaired() + newLine);
        return;
    }
}
