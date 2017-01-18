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
        assertEquals("{was=6, best=1, times,=2, epoch=2, it=6, the=6, incredulity=1, belief,=1, of=6, worst=1, foolishness,=1, wisdom,=1, age=2}", wordCounter.getWordOccurrences());
    }
}