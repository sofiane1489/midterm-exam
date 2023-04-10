package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import static databases.ConnectToSqlDB.connect;
import static databases.ConnectToSqlDB.statement;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> st = new HashMap<>();
		//Demonstration
		//storing elements
		st.put(15, "TIZI");
		st.put(16, "ALGER");
		st.put(10, "BUIRA");
		st.put(06, "VEGAYETH");
		st.put(35, "BOUMERDES");

		//retrieving elements with for each loop
		for (String i : st.values())
			System.out.println(i);
		System.out.println();

		//retrieving elements with for each loop
		for (Map.Entry str : st.entrySet()) {
			System.out.print(str.getKey() + ":");
			System.out.println(str.getValue());
		}
		System.out.println();

		//retrieving elements using while loop with an iterator
		Iterator<Map.Entry<Integer, String>> it = st.entrySet().iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println();

		//Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();

		Map<String, List<String>> list = new HashMap<String, List<String>>();

		List<String> name = new ArrayList<>();
		name.add("Honda");
		name.add("Toyota");
		name.add("Nissan");
		name.add("Mazda");
		name.add("Audi");

		list.put("cars", name);


		// retrieve the List of Strings from the Map using a for-each loop
		System.out.println("Using for-each loop:");
		for (String car : list.get("cars")) {
			System.out.println(car);
		}

//  retrieving elements with for each loop
		for (Map.Entry ca : list.entrySet()) {
			System.out.println("key:" + ca.getKey() + ", values:" + ca.getValue());
			System.out.println();
		}

		//retrieving elements using while loop with an iterator
		Iterator<Map.Entry<String, List<String>>> It = list.entrySet().iterator();
		while (It.hasNext())
			System.out.println(It.next());
		System.out.println();

		//Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		int[] list1 = new int[20];

		connectToSqlDB.insertDataFromArrayToSqlTable(list1, "Map", "values");
		ArrayList<String> numbers = (ArrayList<String>) connectToSqlDB.readDataBase("Map", "values");


	}
	}


