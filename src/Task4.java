public class Task4 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same
    characters in a different order. For example, "listen" and "silent" are anagrams.
     */

    public static int countWords(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println( wordCount);
    }
}
