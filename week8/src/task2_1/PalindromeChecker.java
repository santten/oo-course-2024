package task2_1;

public class PalindromeChecker {
    public boolean isPalindrome(String str){
        String handledString = str.toLowerCase().replaceAll("[\\W_]", "");
        StringBuilder reverseString = new StringBuilder();

        for (int i = handledString.length() - 1; i >= 0; i--){
            reverseString.append(handledString.charAt(i));
        }

        return handledString.contentEquals(reverseString);
    }
}
