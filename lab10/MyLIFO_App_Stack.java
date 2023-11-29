package tuan10;

import java.util.Arrays;
import java.util.Stack;

public class MyLIFO_App_Stack {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> st = new Stack<>();
		for (E arr : array) {
			st.push(arr);
		}
		for (int i = 0; i < array.length; i++) {
			if (st.isEmpty())
				break;
			array[i] = st.pop();
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		Stack<Character> st = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
			} else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
				st.pop();
			} else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
				st.pop();
			} else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
				st.pop();
			}else if(ch==')'||ch==']'||ch=='}') {
				return false;
			}

		}
		return st.isEmpty();
	}

	// This method evaluates the value of a expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		// TODO
		return 0;
	}

	public static <E> void main(String[] args) {
		Integer[] arr = { 1, 2, 3 };
		String text = "[](){}()";

		reserve(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(isCorrect(text));

	}
}
