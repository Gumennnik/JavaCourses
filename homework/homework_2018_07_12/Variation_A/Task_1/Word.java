import java.util.Objects;

public class Word {


    private String word;


    public Word(String word) {
        this.word = word.split(" ")[0];
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return  word.equals(word1.toString());
    }



    @Override
    public int hashCode() {

        return Objects.hash(getWord());
    }

    @Override
    public String toString()
    {
        return this.word;
    }
}
