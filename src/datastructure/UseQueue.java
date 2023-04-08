package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> que=new LinkedList<>();
		//add elements to the queue
		que.add(0);
		que.add(4);
		que.add(7);
		que.add(9);
		que.add(3);
		que.add(5);
		que.add(1);


      // peek is used to view the head of the queue
		System.out.println("the head of the queue: "+que.peek());

        //remove is used to remove an elements
		que.remove(1);

		// poll() method is used to remove the head and return it.
     	System.out.println("the head is:"+que.poll());

       //for each loop to retreive data
          for(Integer number:que)
			  System.out.print(number+" ");
		      System.out.println();

          //while loop with an iterator
		Iterator<Integer> it=que.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		    System.out.println();


		// retrieve FIFO order form the queue
		System.out.print("Queue FIFO: ");
		while(que.isEmpty()==false)
			   System.out.print(que.remove()+" ");
		       System.out.println();
	}

}
