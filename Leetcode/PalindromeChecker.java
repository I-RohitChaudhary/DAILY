public class PalindromeChecker {
    public static boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        if (x < 0) {
            return false;
        }

        // Get the original number and its reverse
        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x)); // Output: true

        x = -121;
        System.out.println(isPalindrome(x)); // Output: false

        x = 10;
        System.out.println(isPalindrome(x)); // Output: false
    }
}
