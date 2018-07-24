import java.util.Objects;

public class Wheel {
    private int diameter;
    private boolean newRubber;

    public Wheel(int diameter, boolean newRubber) {
        this.diameter = diameter;
        this.newRubber = newRubber;
    }



    public int getDiameter() {
        return diameter;
    }

    public boolean isNewRubber() {
        return newRubber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                newRubber == wheel.newRubber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(diameter, newRubber);
    }

    @Override
    public String toString() {
        if(newRubber)
        {
            return "Wheel diameter is " + diameter +
                    " with new rubber" ;
        }else {
            return "Wheel diameter is " + diameter + " with old ruber";
        }


    }
}
