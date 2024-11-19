package Submit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void countWord() {
        Text text = new Text();
        text.countWord("Exercise");
        assertEquals(8, text.totalChar, "Expected totalChar should be 8");
        assertEquals(1, text.totalLn, "Expected totalLn should be 1");
    }

    @Test
    public void testNoText() {
        Text text = new Text();
        text.countWord("");
        assertEquals(0, text.totalChar, "Expected totalChar should be 0");
        assertEquals(1, text.totalLn, "Expected totalLn should be 1");
    }

    @Test
    public void testWithInclusionOfSpacesAndSpecialChars() {
        Text text = new Text();
        text.countWord("Test, that, this, works!");
        text.countWord("in, another, line!");
        assertEquals(42, text.totalChar, "Expected totalChar should be 42");
        assertEquals(2, text.totalLn, "Expected totalLn should be 2");
    }

    @Test
    public void testCountWordWithMixedCaseWords() {
        Text text = new Text();
        text.countWord("Testing CODE");
        assertEquals(12, text.totalChar, "Total characters should be 12.");
        assertEquals(1, text.totalLn, "Total lines should be 1.");
        assertEquals(2, text.totalNoOfWords, "Total number of words should be 2.");
        assertEquals("Testing", text.longestWord, "Longest word should be; 'Testing'.");
    }

    @Test
    public void testCountWordWithMultipleWords() {
        Text text = new Text();
        text.countWord("My name is Esther");
        assertEquals(17, text.totalChar, "Total characters should be 17.");
        assertEquals(1, text.totalLn, "Total lines should be 1.");
        assertEquals(4, text.totalNoOfWords, "Total number of words should be 4.");
        assertEquals("Esther", text.longestWord, "Longest word should be 'Esther'.");
    }

    @Test
    public void testCountWordWithLongerWord() {
        Text text = new Text();
        text.countWord("Java Programming Language");
        assertEquals(25, text.totalChar, "Total characters should be 25.");
        assertEquals(1, text.totalLn, "Total lines should be 1.");
        assertEquals(3, text.totalNoOfWords, "Total number of words should be 3.");
        assertEquals("Programming", text.longestWord, "Longest word should be 'Programming'.");
    }
}




