public class TaskFactorial {

    public long getFactorial() {
        return factorial;
    }

    private int factorial;

    public TaskFactorial(int input) {
        if(input < 15)
        {
            this.factorial = input;
        }
        else
        {
            System.out.println("Number out of range");
        }
    }

    public long calculateFactorial()
    {
        long result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }


        return result;
    }


}
