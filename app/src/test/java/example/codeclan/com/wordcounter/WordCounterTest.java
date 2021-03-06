package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
    }

    @Test
    public void canCreateWordCounter() {
        assertNotNull(wordCounter);
    }

    @Test
    public void canGetNumberOfWords() {
        assertEquals(36, wordCounter.getNumberOfWords());
    }

    @Test
    public void canMakeHashMap() {
        assertEquals("6 * was\n" +
                "6 * the\n" +
                "6 * of\n" +
                "6 * it\n" +
                "2 * times,\n" +
                "2 * epoch\n" +
                "2 * age\n" +
                "1 * worst\n" +
                "1 * wisdom,\n" +
                "1 * incredulity\n" +
                "1 * foolishness,\n" +
                "1 * best\n" +
                "1 * belief,\n", wordCounter.sortedOccurrences());
    }
}