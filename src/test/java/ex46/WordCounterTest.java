package ex46;

import junit.framework.TestCase;

public class WordCounterTest extends TestCase {

    public void testAddWords() {
        WordCounter counter = new WordCounter();
        counter.addWords(" a b b c c c");
        assertEquals(counter.allWords.size(), 6);
        assertEquals(counter.wordCount.size() , 3);
    }
}