package example.codeclan.com.wordcounter;

import java.lang.reflect.Array;
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

    public HashMap<String, Integer> getWordOccurrences() {

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

        return occurrencesMap;
    }

    public String sortedOccurrences() {
        HashMap<String, Integer> occurrencesMap = getWordOccurrences();
        ArrayList<String> occurrencesList = new ArrayList<String>();
        for (String key : occurrencesMap.keySet()) {
            String entry = occurrencesMap.get(key) + " * " + key;
            occurrencesList.add(entry);
        }
        ArrayList<String> stringList = sortStringList(occurrencesList);

        String string = "";
        for (String item : stringList) {
            string += item + "\n";
        }
        return string;
    }

    public ArrayList<String> sortStringList(ArrayList<String> stringList) {
        Collections.sort(stringList, new Comparator<String>() {
                    @Override
                    public int compare(String string1, String string2) {
                        return string2.compareToIgnoreCase(string1);
                    }
                }
        );
        return stringList;
    }



}
