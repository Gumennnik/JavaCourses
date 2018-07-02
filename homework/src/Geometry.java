public class Geometry {
    public Geometry(int a,int b, int r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }
    private int a;
    private int b;
    private int r;
    public boolean isCanBeRepaired()
    {

        return Math.sqrt(a*a+b*b) < r;
    }

}
