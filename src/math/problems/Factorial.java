package math.problems;
import org.junit.Assert;

public class Factorial {
    public static  int factorial(int k){
        if(k==0)
            return 1;
        else
            return k*factorial(k-1);
      }

      public static int facto(int n){
        if(n==1 || n==0)
            return 1;
            int result =1;
            for(int i=2;i<=n;i++)
                result=result*i;
             return result;
      }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        // find Factorial of a given number using Recursion
          int result =factorial(5);
          System.out.println("the factorial of 5 is: "+result);



        //.............................unit testing..................................................
        //..............................test data=factorial of 6!...................................................
        int expectedresult1=720;
        Assert.assertEquals(expectedresult1,result);

       }
}
