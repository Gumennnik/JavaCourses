public class Task3 {

    public static void run(int a, int b, int r){
        String newLine = System.getProperty("line.separator");

        System.out.println("Starting task 3 " + newLine);

        Geometry g = new Geometry(a,b,r);

        System.out.println("Rectangle parametrs are " + g.getA() + " and " + g.getB() + " , circle radius is " + g.getR());

        System.out.println("Can be closed - " + g.isCanBeRepaired() + newLine);
        return;
    }
}
