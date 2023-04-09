package string.problems;

import org.junit.Assert;

import java.util.*;

import static org.junit.Assert.assertTrue;

import java.util.List;

public class Permutation {
    public static List<String> generatePermutations(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return result;
        }

        generatePermutationsHelper(input, "", result);
        return result;
    }

    private static void generatePermutationsHelper(String input, String current, List<String> result) {
        if (input.isEmpty()) {
            result.add(current);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            generatePermutationsHelper(remaining, current + ch, result);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations of " + input + ": " + permutations);

        /*..................................apply unit testing.................................... */
        /*..................................test data=ABC...........................................*/
        //We can create an array this way as below in order to compare it to the actual result
//        ArrayList<String> expected = new ArrayList();
//        expected.add("ABC");
//        expected.add("ACB");
//        expected.add("BAC");
//        expected.add("BCA");
//        expected.add("CAB");
//        expected.add("CBA");

        //or we can create an array as this way below
        List<String> expectedPermutations = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
        Assert.assertEquals(expectedPermutations,permutations);

    }

}