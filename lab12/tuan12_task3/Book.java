package tuan12_task3;


import java.util.List;

public class Book {
	private String id;
	private String title;
	private int price;
	private String type;
	private int year;
	public List<Author> authors;

	public Book(String id, String title, int price, String type, int year, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.type = type;
		this.year = year;
		this.authors = authors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean hasAuthorYear(String name, int years) {
		return (this.year == years) && (this.authors.stream().filter(x -> x.isAuthor(name))).count() > 0;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", type=" + type + ", year=" + year
				+ ", authors=" + authors + "]";
	}

}
