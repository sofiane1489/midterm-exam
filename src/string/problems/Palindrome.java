package string.problems;
import org.junit.Assert;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc=new Scanner(System.in);

        String a,b="";
        System.out.println("enter a string");
        a=sc.nextLine();
        for(int j=0;j<a.length();j++) {
            b=a.charAt(j)+b;}
        if(a.equalsIgnoreCase(b))
            System.out.println("it is palindrome");
        else
            System.out.println("it is not ");

        /*.......................unit test (test data="dos")............................*/
        boolean expected=false;
        Assert.assertEquals(expected,a.equalsIgnoreCase(b));

    }
}

