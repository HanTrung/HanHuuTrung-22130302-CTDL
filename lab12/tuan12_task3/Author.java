package tuan12_task3;

public class Author {
	@Override
	public String toString() {
		return "Author [name=" + name + ", birthYear=" + birthYear + "]";
	}
	private String name;
	private int birthYear;
	public Author(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public boolean isAuthor(String name) {
		return (this.name==name);
	}

}
