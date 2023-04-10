package math.problems;
public class Pattern {

	public static void main(String[] args) {


		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
			int n=100;
			//decrement by 1 upto 90( for 10 numbers 100-90)
			while(n!=90)
			{
				System.out.print(n+",");
				n=n-1;
			}
			//decrement  by 2 upto 70( i.e for 20 numbers 90-70)
			while(n!=70)
			{
				System.out.print(n+",");
				n=n-2;
			}
			//decrement by 3 upto 40( i.e for 30 numbers 70-40)
			while(n!=40)
			{
				System.out.print(n+",");
				n=n-3;
			}
			//decrement by 4 upto 0( i.e for 40 numbers 40-0)
			while(n!=0)
			{
				System.out.print(n+",");
				n=n-4;
			}
			// (n==0)
			System.out.print(n);
		}

	}

