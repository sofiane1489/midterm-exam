package math.problems;

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
      for(int i:fibonacci)
          System.out.println(i);

      }
    }

