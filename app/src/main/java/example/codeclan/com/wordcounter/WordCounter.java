package example.codeclan.com.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 17/01/2017.
 */

public class WordCounter {

    String sentence;

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    public int getNumberOfWords() {
//        System.out.println(sentence);
        String[] result = sentence.split("\\s");
        ArrayList<String> wordArray = new ArrayList<String>(Arrays.asList(result));
        return wordArray.size();

    }
}
