import java.util.Random;

public class TaskArraySumm {
    private int[] array;

    public TaskArraySumm(int arraySize) {
        this.array = new int[arraySize];
    }

    public void generateArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 +  rand.nextInt(9);
        }
        System.out.println(" Our array is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("");

        return;
    }



    public void printBetweenMinAndMax()
    {
        int minIndex = getIndexOfmin();
        int maxIndex = getIndexOfmax();
        if (minIndex <= maxIndex)
        {
            for (int i = minIndex; i <= maxIndex; i++) {
                System.out.print(array[i] + ", ");
            }
        }
        else {
            for (int i = maxIndex; i <= minIndex; i++) {
                System.out.print(array[i] + ", ");
            }

        }



        return;
    }



    private int getIndexOfmin()
    {
        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i <array.length ; i++) {
            if (array[i] < min)
            {
                min = array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }


    private int getIndexOfmax()
    {
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i <array.length ; i++) {
            if (array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}
