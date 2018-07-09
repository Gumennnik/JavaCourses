public class TaskFindSumm {
    public TaskFindSumm(int count, int divide) {
        this.count = count;
        this.divide = divide;
    }

    private int count;
    private int divide;

    public int findOfThreeDividibleByThree()
    {
        int counter = 0;
        int result = 0;
        for (int i = 1; counter < count ; i++) {
            if( i%divide == 0)
            {
                counter++;
                result += i;
            }

        }
        return result;
    }
}
