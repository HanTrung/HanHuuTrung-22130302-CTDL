package tuan9_Task1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Faculty {
	private String name;
	private String address;
	private List<Course> course;

	public Faculty(String name, String address, List<Course> course) {
		super();
		this.name = name;
		this.address = address;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + course + "]";
	}

	public Course getMaxPracticalCourse() {
		Course course = null;
		int max = 0;
		for (Course cou : this.course) {
			if (cou.getType().equals("TH")) {
				int temp = cou.getStudents().size();
				if (temp > max) {
					max = temp;
					course = cou;
				}
			}

		}
		return course;
	}

	Map<Integer, List<Student>> groupStudentByYear() {
		Map<Integer, List<Student>> re = new HashMap<>();
		for (Course c : course) {
			for (Student st : c.getStudents()) {
				int key = st.getYear();
				List<Student> value = new ArrayList<>();
				if (!re.containsKey(key)) {
					value.add(st);
				} else {
					value = re.get(key);
					if (!value.contains(st))
						value.add(st);

				}
				re.put(key, value);
			}

		}
		return re;
	}
	public Set<Course> filterCourses(String type){	
       List<Course> filteredList = new ArrayList<>();
       for (Course c : course) {
           if (c.getType().equals(type)) {
               filteredList.add(c);
           }
       }

       // Sắp xếp danh sách giảm dần theo số lượng sinh viên
       Collections.sort(filteredList, new Comparator<Course>() {
           @Override
           public int compare(Course course1, Course course2) {
               int studentCount1 = course1.getStudents().size();
               int studentCount2 = course2.getStudents().size();

               // Sắp xếp giảm dần theo số lượng sinh viên
               return Integer.compare(studentCount2, studentCount1);
           }
       });

       // Chuyển đổi danh sách đã sắp xếp thành một Set và trả về
       return new HashSet<>(filteredList);
   }

}
