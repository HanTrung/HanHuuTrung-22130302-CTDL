package tuan12_task3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Library {
	private String name;
	public List<Book> books;
	

	public Library(String name, List<Book> books) {
		this.name = name;
		this.books = books;
	}

	public Book getOldestBook() {
//	Book re = books.get(0);
//	for (int i = 0; i < books.size(); i++) {
//		if (books.get(i).getYear() < re.getYear()) {
//			return books.get(i);
//		}
//	}
//	return re;
		Comparator<Book> cmp = Comparator.comparing(Book::getYear);
		return this.books.stream().max(cmp).get();
	}

	public Map<Integer, List<Book>> getBookByYears() {
//		Map<Integer, List<Book>> re = new HashMap<>();
//		for (Book book : books) {
//			int key = book.getYear();
//			List<Book> list = new ArrayList<Book>();
//			if(!re.containsKey(key)) {
//				list.add(book);
//			} else {
//				list
//			}
//		}
		return this.books.stream().collect(Collectors.groupingBy(Book::getYear));
	}

	public Set<Book> findBooks(String authorName, int year) {
		Comparator<Book> cmp= Comparator.comparing(Book::getYear);
		return this.books.stream().filter(x->x.hasAuthorYear(authorName, year)).collect(Collectors.toCollection(()-> new TreeSet<>(cmp)));
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", books=" + books + "]";
	}
}
