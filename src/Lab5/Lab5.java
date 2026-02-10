package Lab5;

public class Lab5 {

// задание 1
    public String findLongestWord(String text) {

        String[] words = text.split(" ");
        String longestWord = "";

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
//задание 2
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

//задание 3
public static String censorText(
        String text1,
        String word,
        boolean ignoreCase,
        String replacement
) {
    String regex = ignoreCase ? "(?i)" + word : word;
    return text1.replaceAll(regex, replacement);
}

//задание 4
public static int countSubstring(String sourceText, String sub) {

    int count = 0;

    for (int i = 0; i <= sourceText.length() - sub.length(); i++) {

        boolean match = true;

        for (int j = 0; j < sub.length(); j++) {
            if (sourceText.charAt(i + j) != sub.charAt(j)) {
                match = false;
                break;
            }
        }

        if (match) {
            count++;
        }
    }

    return count;}



    public static String reverseEachWordInText(String originalText) {

        String[] words = originalText.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();

    }

}





