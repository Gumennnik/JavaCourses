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
        if (this == obj) return true;
        if (!(obj instanceof Text)) return false;
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        String resultString = "";
        for (Sentense s:text
             ) {
            resultString += s.toString();
        }
        return resultString;
    }


}




// 1 in 2 in 3 in 4 in 4 throw 3 catch 3 out 2 out 1 out