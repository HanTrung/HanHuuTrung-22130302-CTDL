package tuan9_Task1;

import java.util.List;

public class Course {
	private String id;
	private String tittle;
	private List<Student> students;
	private String type;
	private String leturer;

	public Course(String id, String tittle, List<Student> students, String type, String leturer) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.students = students;
		this.type = type;
		this.leturer = leturer;
	}
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", tittle=" + tittle + ", students=" + students + ", type=" + type + ", leturer="
				+ leturer + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTittle() {
		return tittle;
	}


	public void setTittle(String tittle) {
		this.tittle = tittle;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getLeturer() {
		return leturer;
	}


	public void setLeturer(String leturer) {
		this.leturer = leturer;
	}


	public void groupStudentByYear() {

	}

}
