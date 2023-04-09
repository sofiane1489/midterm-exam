package string.problems;

import org.junit.Assert;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("The permutation of the given string are :");
       find_permutations(str, "");

        /* .............................unit testing....................................*/
        //test data=abc
        String expected="abc acb bac bca cab cba";

    }
   public static void find_permutations(String str,String res){
        if (str.length() == 0)
          {
            System.out.print(res + " ");
            //return;
            }
        boolean flag[] = new boolean[55];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String rem_str = str.substring(0, i) + str.substring(i + 1);
            if (flag[ch - 'A'] == false)
                find_permutations(rem_str, res + ch);
                flag[ch - 'A'] = true;
            find_permutations(rem_str, res + ch);
            return ;
        }
    }
}
