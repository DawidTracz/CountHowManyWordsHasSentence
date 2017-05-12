import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by User on 28.04.2017.
 */
public class Test {

    private WordCounter wordCounter;

    @Before
    public void setUp() throws Exception {
        wordCounter = new WordCounter();
    }

    @org.junit.Test
    public void shouldReturnZeroWhenNoSentenceWasGiven() {

        int count = wordCounter.getCount("Ala");

        assertEquals(0, count);
    }

    @org.junit.Test
    public void shouldReturn1One1Occurrence() throws Exception {
        wordCounter.count("Ala ma kota");

        int count = wordCounter.getCount("Ala");

        assertEquals(1, count);
    }
    @org.junit.Test
    public void shouldReturn1Zero1WhenNoWordGiven() throws Exception {
        wordCounter.count("Ala ma kota");

        int count = wordCounter.getCount("");

        assertEquals(0, count);
    }

    @org.junit.Test
    public void shouldReturn2WhenWordOccursTwiceInSentence() throws Exception {
        wordCounter.count("Ala ma kota Ala");

        int count = wordCounter.getCount("Ala");

        assertEquals(2, count);
    }

    @org.junit.Test
    public void shouldReturn2WhenWordOccursTwiceInSentenceIngoringCase() throws Exception {
        wordCounter.count("Ala ma kota ala");

        int count = wordCounter.getCount("Ala");

        assertEquals(2, count);
    }

    @org.junit.Test
    public void shouldReturn2WhenSameSentenceIsGivenTwice() throws Exception {
        wordCounter.count("Ala ma kota. Ala ma kota");

        int count = wordCounter.getCount("kota");

        assertEquals(2, count);

    }
}