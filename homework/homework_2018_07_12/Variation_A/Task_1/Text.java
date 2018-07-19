import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentense> text;

    public Text(Sentense... text) {
        this.text = new ArrayList<Sentense>();
        for (Sentense s:text
             ) {
            this.text.add(s);

        }
    }

    public void addSentence(Sentense sentense)
    {
        this.text.add(sentense);
        return;
    }


    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
