package string.problems;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        for (String word : wordNLength.values()) {
            s = word.length() + " " + word;
        }
        /*....................................unit test...........................................*/
        /* ................................test data= string s...................................*/
        String expected="10 biological";
        Assert.assertEquals(expected,s);

        System.out.println(s);
        }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String words[] = wordGiven.split(" ");
        String maxWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        map.put(maxWord.length(), maxWord);
        return map;
    }
}
