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
                assertEquals(18, text.totalChar, "Expected totalChar should be 18");
                assertEquals(2, text.totalLn, "Expected totalLn should be 2");
            }
        }




