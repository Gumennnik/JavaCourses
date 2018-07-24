
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sentense {

    private List<Word> sentence;

    public Sentense(Word... words) {
        sentence = new ArrayList<Word>();
        for (Word word:words
             ) {
            this.sentence.add(word);
        }
    }

    public void addWord(Word word)
    {
        sentence.add(word);
        return;
    }

    public String getSentence() {
        return sentence.toString();
    }

    @Override
    public String toString()
    {
        String result = "";

        for (Word word:sentence
             ) {
            result += word.toString() + " ";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

//        System.out.println("s1:" + this.toString());
//        System.out.println("s2:"+sentense.toString());

        return this.toString().equals(o.toString());
    }

    @Override
    public int hashCode() {

        return Objects.hash(this.toString());
    }
}
