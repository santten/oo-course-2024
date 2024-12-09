package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @Test
    void concenateStringWorks(){
        StringManipulator sm = new StringManipulator();
        assertEquals("okay", sm.concatenate("ok", "ay"));
        assertEquals("12345678", sm.concatenate("1234", "5678"));
        assertEquals("Metropolia", sm.concatenate("Metro", "polia"));
    }

    @Test
    void findLengthWorks(){
        StringManipulator sm = new StringManipulator();
        assertEquals(4, sm.findLength("test"));
        assertEquals(16, sm.findLength("Find This Length"));
        assertEquals(2, sm.findLength("ok"));
    }

    @Test
    void upperAndLowerConversionWorks(){
        StringManipulator sm = new StringManipulator();
        String testStr = "Test";

        assertEquals("TEST", sm.convertToUpperCase(testStr));
        assertEquals("test", sm.convertToLowerCase(testStr));

        String testStr2 = "oKaY";
        assertEquals("OKAY", sm.convertToUpperCase(testStr2));
        assertEquals("okay", sm.convertToLowerCase(testStr2));
    }

    @Test
    void subStringMethodWorks(){
        StringManipulator sm = new StringManipulator();

        assertTrue(sm.containsSubstring("abcdefg", "abc"));
        assertFalse(sm.containsSubstring("abcdefg", "123"));

        assertTrue(sm.containsSubstring("ok ok ok", "k o"));
        assertFalse(sm.containsSubstring("ok ok ok", "okokok"));
    }

    @Test
    void multipleMethodsForOneString(){
        StringManipulator sm = new StringManipulator();
        String originalStr = "okay";
        String mutilatedStr = sm.concatenate(originalStr, originalStr);
        assertEquals("OKAYOKAY", sm.convertToUpperCase(mutilatedStr));
    }
}
