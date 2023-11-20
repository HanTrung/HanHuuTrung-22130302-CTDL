package tuan9_Task1;

import java.util.ArrayList;
import java.util.List;

public class testLab9T1 {public static void main(String[] args) {
	Student st1 = new Student( "011", "Tuan1", 2004 );
	Student st2 = new Student( "012", "Tuan2", 2005 );
	Student st3 = new Student( "013", "Tuan3", 2006 );
	
	List<Student> arr1= new ArrayList();
	arr1.add(st1);
	arr1.add(st2);
	arr1.add(st3);
	
	List<Student> arr2= new ArrayList();
	arr2.add(st2);
	arr2.add(st3);
	
	Course cou1= new Course("111", "CTDL", arr1, "TH", "Du");
	Course cou2= new Course("111", "CTDL", arr2, "LT", "Du");
	
	List<Course> listCou= new ArrayList<Course>();
	listCou.add(cou1);
	listCou.add(cou2);
	
	Faculty fal= new Faculty("CTDL", "RangDong", listCou);
	
	//System.out.println(fal.getMaxPracticalCourse());
	System.out.println(fal.groupStudentByYear());
	
	
}

}
