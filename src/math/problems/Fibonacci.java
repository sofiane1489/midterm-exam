package math.problems;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int[] fibonacci=new int[40];
        fibonacci[0]=0;
        fibonacci[1]=1;
      for(int i=2;i<40;i++)
         {
           fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

          }
       for(int i:fibonacci){
           System.out.print(i+",");
         }
       System.out.println();

/*........................................Apply unit testing...................................*/
  /*......................................test data=40...........................................*/
//
            int[] exppectedResult={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986};
               Assert.assertArrayEquals(exppectedResult,fibonacci);
      }
    }

