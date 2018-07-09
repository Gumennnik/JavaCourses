import java.util.Random;

public class TaskWithButterflyArray {
    int[][] array;

    public TaskWithButterflyArray(int arraySize) {
        this.array = new int[arraySize][arraySize];
    }

    public void generateArray()
    {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                array[i][j] = 1;
            }
        }

        int counter = 0;
        for (int i = 1; i < array.length/2 ; i++) {
            for (int j = 0; j <= array.length/2; j++) {
                if( j <= counter )
                {
                    array[i][j] = 0;
                    array[i][array.length - j-1] = 0;
                    array[array.length - i - 1][j] = 0;
                    array[array.length - i -1][array.length - j -1] = 0;
                }
            }
            counter++;
        }

        if (array.length%2 == 1)
        {
            for (int i = 0; i < array[0].length ; i++) {
                array[(array.length/2)][i] = 0;

            }
            array[(array.length/2)][(array.length/2)] = 1;
        }




//        System.out.println(" Our array is "+array.length + array[0].length);
//        System.out.println("Array lenght is " + array.length);
//        System.out.println("Array second lenght is " + array[(array.length/2 + 1 )].length);
        for (int i = 0; i < array.length; i++) {
            System.out.print( i + 1 + ") ");
            for (int j = 0; j < array[0].length ; j++) {
                System.out.print(array[i][j] + ", ");;
            }
            System.out.println(" ");
        }


    }




}
