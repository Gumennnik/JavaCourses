public class MoneyAnswerer {
    public MoneyAnswerer(int input) {
        this.moneyCount = input;
        return;
    }

    private int moneyCount;

    public String toString()
    {
        if (moneyCount%100 < 20 && moneyCount%100 > 10)
        {
            return Integer.toString(moneyCount)+" рублей";
        }

        int lastInt = moneyCount % 10;
        switch (lastInt)
        {
            case 1:{
                return Integer.toString(moneyCount)+" рубль";
            }
            case 2:{
                return Integer.toString(moneyCount)+" рубля";
            }
            case 3:{
                return Integer.toString(moneyCount)+" рубля";
            }
            case 4:{
                return Integer.toString(moneyCount)+" рубля";
            }
            default:return Integer.toString(moneyCount)+" рублей";
        }

    }


}
