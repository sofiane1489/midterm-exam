package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> numbers=new ArrayList<>();
		//add elements to the array
		numbers.add(4);
		numbers.add(6);
		numbers.add(9);
		numbers.add(0);
		numbers.add(1);
		numbers.add(3);
		numbers.add(8);

		//remove an item
		numbers.remove(3);
		System.out.println(numbers);

		//retrieve elements with for each loop
		for(int i:numbers)
		{
			System.out.print(i+" ");
		}System.out.println();

       //retrieve elements using wile loop with an iterator
		Iterator so=numbers.iterator();
		while(so.hasNext()){
			System.out.print(so.next()+" ");}
		System.out.println();

	}

}
