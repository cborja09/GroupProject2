public class Task2 {

    /*
    Check if a String is Palindrome: Determine whether a given string is a palindrome,
    which means it reads the same forwards and backward. For example, "madam" is a palindrome.
     */

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
