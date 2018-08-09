package com.buturlia.hm5;

import java.util.*;
@OwnAnnotation(version = "1.0", codeName = "Prianik")
public class FrequencyDictionary {
    private String inputedText;
    private Set<String> wordsSet;
    private HashMap wordHashMap;

    public FrequencyDictionary(String inputedText) {
        this.inputedText = inputedText;
    }

    public void calculateWords()
    {
        System.out.println(inputedText.length());
        System.out.println(inputedText.toString());

        String[] tempString = inputedText.split("\\W");
        ArrayList wordsInArray = new ArrayList();

        for (String s : tempString
             ) {
            if (s.length() != 0)
            {
                wordsInArray.add(s);
            }

        }

        System.out.println(wordsInArray.toString());
        System.out.println(wordsInArray.size());

        wordsSet = new HashSet(wordsInArray);

        System.out.println("Uniqe words count is " + wordsSet.size());
    }

    public void calculateFrequensies()
    {
        System.out.println("Debug message: calculateFrequensies method");
        int count;
        wordHashMap = new HashMap<String, Integer>();
        String[] tempString = inputedText.split("\\W");
        for (String s:tempString
             ) {
            wordHashMap.put(s, 0);
        }



        for (String word: inputedText.trim().split("\\W")
             ) {
//            System.out.println("For word " + word);
            if (word.length() == 0) {
                continue;
            }

            wordHashMap.put(word, (Integer)wordHashMap.get(word) + 1 );



        }

    }


    public void printFrequencyDictionary()
    {

        wordHashMap.forEach( ( Object key, Object values ) -> {
            System.out.println(key);
            System.out.println(values);

        });
    }


}
