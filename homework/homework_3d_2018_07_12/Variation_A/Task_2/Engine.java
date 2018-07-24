import java.util.Objects;

public class Engine {
    private String name;
    private int horsePower;

    public Engine(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine obj = (Engine) o;
        return horsePower == obj.horsePower && name == obj.getName();
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, horsePower);
    }

    @Override
    public String toString() {
        return name + " " + Integer.toString(horsePower);
    }
}
