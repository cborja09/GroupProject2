import java.util.Arrays;

public class Task4 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same
    characters in a different order. For example, "listen" and "silent" are anagrams.
     */

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String word = "listen";
        String word1 = "silent";

        if (areAnagrams(word, word1)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
