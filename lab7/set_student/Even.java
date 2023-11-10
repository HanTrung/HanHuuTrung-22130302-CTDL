package lab7.set_student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Even implements Predicate<Integer> {
	public boolean test(Integer i) {
		return (i % 2 == 0);
	}
	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        Predicate<Integer> evenNumber = x -> x % 2 == 0;

	        MyPredicates.remove(numbers, evenNumber); 
	        System.out.println(numbers); 

	        MyPredicates.retain(numbers, x -> x > 2); 
	        System.out.println(numbers);


	        int firstEvenIndex = MyPredicates.find(numbers, evenNumber);
	        System.out.println(firstEvenIndex); 
	    }
	
}