import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("Hello World"));
        assertFalse(PalindromeChecker.isPalindrome("Java Programming"));
    }

    @Test
    public void testSpecialCharacters() {
        assertTrue(PalindromeChecker.isPalindrome("No 'x' in Nixon"));
        assertTrue(PalindromeChecker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testEmptyString() {
        assertFalse(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testNullString() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}
