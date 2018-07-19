public class Task_runner {

    public static void main(String[] args) {
        //text, word, sentense
        Word word = new Word("Teeth");
        Word word1 = new Word("Teeth");
        Word word2 = new Word("Different");

        System.out.println(word.equals(word1));
        System.out.println(word.equals(word2));
        word.equals(word1);


        Sentense sentense = new Sentense(word,word1, new Word(", "),word2);
        System.out.println(sentense.toString());
//        System.out.println(sentense.getSentence());
        Sentense sentense2 = new Sentense(word,word1, new Word(","),word2);
        System.out.println(sentense.equals(sentense2));
        System.out.println(" ");
        System.out.println(sentense.hashCode() == sentense2.hashCode());




    }
}
