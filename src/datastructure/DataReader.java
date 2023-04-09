package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		String store="";
		FileReader fr= null;
		try {
			fr = new FileReader("C:\\Users\\sehso\\eclipse-workspace\\midterm-coding-exam\\src\\data\\self-driving-car");
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		BufferedReader br=new BufferedReader(fr);
		String line=null;

		try {
			while((line=br.readLine())!=null){
				store=store+line;
				System.out.println(line);
			}
			System.out.println();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			try {
				br.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		String[] storeArray = store.split(" ");
		// create empty stack and list

		Stack<String> stack = new Stack<String>();

		LinkedList<String> list = new LinkedList<String>();

// store each word to stack and list

		for (String element : storeArray) {

// as specified in question stack add, push to add element

			list.add(element);

			stack.push(element);


		}

// retrieve FIFO order form linked list

		System.out.println("LinkedList FIFO : ");

		while (list.isEmpty()==false)
			System.out.print (list.remove() + " ");
		        System.out.println();

// since stack if LIFO

		System.out.println("Stack FILO : ");
		while (stack.isEmpty()==false) {

			System.out.print(stack.pop() + " ");

		}

	}

}


