public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the normalized string is a palindrome
        int left = 0;
        int right = normalizedStr.length() - 1;
        
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    // Main method for testing the utility class
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("Able was I ere I saw Elba"));     // true
        System.out.println(isPalindrome("racecar"));                        // true
        System.out.println(isPalindrome("Hello World"));                     // false
        System.out.println(isPalindrome("Java Programming"));                // false
        System.out.println(isPalindrome("No 'x' in Nixon"));                 // true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));   // true
        System.out.println(isPalindrome(""));                               // false
        System.out.println(isPalindrome(null));                              // false
    }
}
