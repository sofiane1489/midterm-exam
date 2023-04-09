package math.problems;

import org.junit.Assert;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrimeNumber {
	static boolean checkPrime(int n) {
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int numberOfPrimes = 0;

		ArrayList<Integer> arrList = new ArrayList<>();

		for(int i=2; i<=1000000; i++)
		{

			if(checkPrime(i)){
				arrList.add(i);
				numberOfPrimes++;

			}
		}System.out.println(arrList);
		System.out.println(numberOfPrimes);

		//unit test
		// test data=4
		boolean expectedCheck=false;
		Assert.assertEquals(expectedCheck,checkPrime(4));

		try
		{
			FileWriter writer = new FileWriter("primeNumbers.txt");
			for(int i=0; i<arrList.size(); i++)
			{
				writer.write(arrList.get(i) + ", ");
				if((i+1) % 10 == 0){
					writer.write("\n");
				}
			}
			writer.close();
			System.out.println("Data successfully wrote to the file!");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}


