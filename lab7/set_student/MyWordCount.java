package lab7.set_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<>();
		for (String w : words) {
			WordCount wc = new WordCount(w, count(w));
			if (!re.contains(wc)) {
				re.add(wc);
			}

		}

		return re;

	}

	private int count(String w) {
		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals(w))
				count++;
		}

		return count;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	public Set<String> getUniqueWords() {
		Set<String> str = new HashSet<>();
		for (WordCount wc : getWordCounts()) {
			if (wc.getCount() == 1) {
				str.add(wc.getWord());
			}
		}
		return str;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		Set<String> str = new HashSet<>();
		for (WordCount wc : getWordCounts()) {
			str.add(wc.getWord());
		}
		return str;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		Set<WordCount> wordCountSet = new TreeSet<>(new Comparator<WordCount>() {
			public int compare(WordCount wc1, WordCount wc2) {
				return wc1.getWord().compareTo(wc2.getWord());
			}

		});
		for (WordCount wc : getWordCounts()) {
			wordCountSet.add(wc);
		}
		for (WordCount wc : getWordCounts()) {
			System.out.println(wc.getWord() + "-" + wc.getCount());
		}

		return wordCountSet;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurrence() {
		Set<WordCount> wordCountSet = new TreeSet<>(new Comparator<WordCount>() {
			public int compare(WordCount wc1, WordCount wc2) {
				return Integer.compare(wc1.getCount(), wc2.getCount());

			}

		});
		wordCountSet.addAll(getWordCounts());

		for (WordCount wc : getWordCounts()) {
			System.out.println(wc.getWord() + "-" + wc.getCount());
		}

		return wordCountSet;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		Set<String> re = new HashSet<>();
		for (String word : words) {
			if (!word.startsWith(pattern)) {
				re.add(word);
			}
		}
		return re;

	}

	public static void main(String[] args) {
		MyWordCount myWord = new MyWordCount();
		List<WordCount> wordCounts = myWord.getWordCounts();
		System.out.println("Word Counts:");
		for (WordCount wc : wordCounts) {
			System.out.println(wc.getWord() + " - " + wc.getCount());
		}
		Set<String> str = myWord.getUniqueWords();
		for (String wc : str) {
			System.out.println(str);
		}

		Set<String> str1 = myWord.getDistinctWords();
		for (String wc : str1) {
			System.out.println(str1);
		}

		
		System.out.println("\nWord Counts (Ascending Order):");
		myWord.printWordCounts();

		System.out.println("\nWord Counts (Descending Order):");
		myWord.exportWordCountsByOccurrence();


		String pattern = "A"; // Đổi mẫu theo nhu cầu
		Set<String> filteredWords = myWord.filterWords(pattern);
		System.out.println("\nFiltered Words (Words not starting with '" + pattern + "'): ");
		for (String word : filteredWords) {
			System.out.println(word);
		}
	}
}
