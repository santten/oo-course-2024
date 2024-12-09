package task2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {
    PalindromeChecker pc = new PalindromeChecker();

    @Test
    void checkRealPalindromes(){
        assertTrue(pc.isPalindrome("saippuakauppias"));
        assertTrue(pc.isPalindrome("racecar"));
        assertTrue(pc.isPalindrome("tacocat"));
    }

    @Test
    void checkFalsePalindromes(){
        assertFalse(pc.isPalindrome("testi"));
        assertFalse(pc.isPalindrome("this is not a palindrome"));
        assertFalse(pc.isPalindrome("nope"));
    }

    @Test
    void ignoresWhiteSpace(){
        assertTrue(pc.isPalindrome("taco cat"));
        assertTrue(pc.isPalindrome("race \ncar"));
        assertTrue(pc.isPalindrome("t a c o    cat"));
    }

    @Test
    void ignoresPunctuationAndCapitalization(){
        assertTrue(pc.isPalindrome("Taco Cat!!"));
        assertTrue(pc.isPalindrome("race Car..."));
        assertTrue(pc.isPalindrome("SaIPpuAKauPpIaS ??"));
        assertTrue(pc.isPalindrome("This is (a longer) example: elpmaxe regnol a si Siht!"));
    }
}