package example.codeclan.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 17/01/2017.
 */

public class WordCounter {

    ArrayList<String> wordsArrayList;

    public WordCounter(String sentence) {

        String[] wordsArray = sentence.split("\\s");
        this.wordsArrayList = new ArrayList<String>(Arrays.asList(wordsArray));

    }

    public int getNumberOfWords() {
        return wordsArrayList.size();
    }

    public String getWordOccurrences() {

        HashMap<String, Integer> occurrencesMap= new HashMap<String, Integer>();

        for (String word : wordsArrayList) {
            String lWord = word.toLowerCase();
            boolean wordNotInMap = (occurrencesMap.get(lWord) == null);

            if (wordNotInMap) {
                occurrencesMap.put(lWord, 1);
            } else {
                Integer current = occurrencesMap.get(lWord);
                occurrencesMap.put(lWord, current + 1);;
            }
        }

        return occurrencesMap.toString();
    }

}
