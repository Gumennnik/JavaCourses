package homework_2018_06_28;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.net.Inet4Address;

public class NumberSaving {
    public NumberSaving( int input) {
        targenNumber = input;
        return;
    }

    public int getTargenNumber() {
        return targenNumber;
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

    public void reverseIfFourNumbersAndSyso()
    {
        if (targenNumber > 999 && targenNumber < 10000)
        {
            String saveNumberAsString = Integer.toString(targenNumber);
            char[] CharArray = saveNumberAsString.toCharArray();
            saveNumberAsString = Character.toString(CharArray[3])+Character.toString(CharArray[2])+Character.toString(CharArray[1])+Character.toString(CharArray[0]);
            System.out.println("reversed is " + saveNumberAsString);
        }
        else System.out.println("Число "+ targenNumber +" не четырёхзначное");

    }

    public void allNubersAreDiferent()
    {
        System.out.println("Текущее число "+targenNumber);
        if (targenNumber > 999 && targenNumber < 10000)
        {
            String saveNumberAsString = Integer.toString(targenNumber);
            char[] charArray = saveNumberAsString.toCharArray();
            int counter = 0;
            for (char a:charArray
                 ) {
                    for (int i = charArray.length -1; i >= 0; i--)
                    {
                        if (a == charArray[i])
                        {
                                counter++;
                        }
                    }
            }
            if (counter > charArray.length)
            {
                System.out.println("Есть совподающие цифры");
            }
            else {
                System.out.println("Все цифры разные");
            }


        }
        else System.out.println("Число "+ targenNumber +" не четырёхзначное");

    }




}
