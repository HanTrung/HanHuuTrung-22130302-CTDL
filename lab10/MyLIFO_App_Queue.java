package tuan10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class MyLIFO_App_Queue {
	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			E ele = input.poll();
			input.offer(ele);
			input.offer(ele);
		}
	}

	// Method mirror that accepts a queue of strings as a parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c] back
	// becomes
	// front [a, b, c, c, b, a] back
	public static <E> void mirror(Queue<E> input) {
		int size = input.size();
		Stack<E> st= new Stack<>();
		for (int i = 0; i < size; i++) {
			E ele = input.poll();
			input.offer(ele);
			st.push(ele);
		}
		while(!st.isEmpty()) {
			E ele= st.pop();
			input.offer(ele);
			
		}
	}
	public static void main(String[] args) {
		Queue<Integer> que1= new LinkedList<>();
		que1.offer(1);
		que1.offer(2);
		que1.offer(3);
		stutter(que1);
		System.out.println(que1.toString());
		
		Queue<String> que2= new LinkedList<>();
		que2.offer("a");
		que2.offer("b");
		que2.offer("c");
		mirror(que2);
		System.out.println(que2.toString());
		
		
	}
}