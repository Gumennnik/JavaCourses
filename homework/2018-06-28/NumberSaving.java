import java.net.Inet4Address;

public class NumberSaving {
    public NumberSaving( int input) {
        targenNumber = input;
        return;
    }

    int targenNumber;


    public boolean isThreeDigets()
    {
        String temp = Integer.toString(targenNumber);
        //System.out.println( "Current length " + temp.length());
        return temp.length() == 3;
    }
    public boolean islastIsSeven()
    {
        System.out.println("Last is " + (targenNumber%10)+". Is it 7? "+ ((targenNumber%10) == 7));
        return (targenNumber%10) == 7;
    }

    public boolean isDividableByTwo() {
        System.out.println("Is dividable by 2 ? " + (targenNumber%2 == 0) );
        return targenNumber%2 == 0;
    }

    public void reverseIfFourNumbers()
    {
        if (targenNumber >= 0 && targenNumber < 10000)
        {
            String saveNumberAsString = Integer.toString(targenNumber);
            char[] CharArray = saveNumberAsString.toCharArray();
            saveNumberAsString = Character.toString(CharArray[3])+Character.toString(CharArray[2])+Character.toString(CharArray[1])+Character.toString(CharArray[0]);
            System.out.println("reversed is " + saveNumberAsString);
        }
        else System.out.println("Число "+ targenNumber +" не трёхзначное");

    }
    //создаём число
    // Определяем количество знаков
    // если знаков 3 - сигналим.
    // определяем, является ли его последняя цифра семёркой
    // Определите, является ли число чётным.



}
