package lab8_map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyWordCountApp {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";
	// <word, its occurences>
	private Map<String, Integer> map = new HashMap<String, Integer>();

	// Load data from fileName into the above map (containing <word, its
	// occurences>)
	// using the guide given in TestReadFile.java
	public void loadData() throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fileName));
		while (sc.hasNext()) {
			String word = sc.next();
			map.put(word, map.getOrDefault(word, 0) + 1);
			System.out.println(word);
		}

	}

	// Returns the number of unique tokens in the file data/hamlet.txt or fit.txt
	public int countUnique() {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		tree.putAll(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if(val<=1)
			System.out.println(key + " " + val);
		}
		return 0;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public void printWordCounts() throws FileNotFoundException {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		tree.putAll(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according to ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public void printWordCountsAlphabet() throws FileNotFoundException {

		map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

	}

	public static void main(String[] args) throws FileNotFoundException {
		MyWordCountApp my = new MyWordCountApp();
		my.loadData();
//		my.printWordCounts();
//		my.printWordCountsAlphabet();
		my.countUnique();
	}
}
