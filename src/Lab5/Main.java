package Lab5;

import static Lab5.Lab5.censorText;
import static Lab5.Lab5.isPalindrome;

public class Main {
    public static void main(String[] args) {

        Lab5 lab5 = new Lab5();


        System.out.println("= Задание 1: Наиболешее слово =");

        String text = "Одно Кольцо, чтобы управлять ими всеми, Одно Кольцо, чтобы найти их" +
                "Одно кольцо, чтобы собрать их всех и связать во тьме";

        String longestWord = lab5.findLongestWord(text);
        System.out.println("Самое длинное слово: " + longestWord);


        System.out.println("= Задание 2: Проверка  на палиндром  =");
        String word1 = "Казак";
        String word2 = "Дом";
        String word3 = "довоД";

        System.out.println(word1 + " → " + isPalindrome(word1));
        System.out.println(word2 + " → " + isPalindrome(word2));
        System.out.println(word3 + " → " + isPalindrome(word3));


        System.out.println("= Задание 3: Цензурирование =");

        String text1 = "Я сидел и доедал последний кусочек торта, " +
                "сзади открылась дверь, по шагам я узнал свою жену, " +
                "моя спина покрылась мурашками. Ах ты бяка, не оставил мне ни крошки!";

        String badWord = "бяка";
        String replacement = "[вырезано цензурой]";

        String result = censorText(text1, badWord, replacement);

        System.out.println(result);


        System.out.println("= Задание 4: Подстроки =");

        String sourceText = "abababa";
        String sub = "aba";

        int count = Lab5.countSubstring(sourceText, sub);

        System.out.println("Текст: " + sourceText);
        System.out.println("Подстрока: " + sub);
        System.out.println("Количество вхождений: " + count);


        System.out.println("= Задание 5: Инвертирование слов =");

        String originalText = "This is a test string";

        System.out.println("The given string is: " + originalText);
        System.out.println("The string reversed word by word is:");
        System.out.println(Lab5.reverseEachWordInText(originalText));


    }




}
