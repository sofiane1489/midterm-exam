package math.problems;

public class FindMissingNumber {

    public static void missingNumber(int[] arr,int n){
      int sumExpectedResult=0;
      int actualResult=0;

      for(int i=1;i<=n;i++)
          sumExpectedResult=sumExpectedResult+i;

         for(int i=0;i<n-1;i++)
             actualResult=actualResult+arr[i];
        System.out.println("the missing number is: "+(sumExpectedResult-actualResult));
    }

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int n=10;

         missingNumber(array,10);

         //apply unit testing
         //test data=11
        int expectedResult;


    }
}
