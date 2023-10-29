package tuan6;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList(E[] elements, int size) {
		super();
		this.elements = elements;
		this.size = size;
	}

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// creates an array of double-size if the array of elements is full

	public void growSize() {

		if (size == elements.length) {
			E[] newElement = (E[]) new Object[size * 2];
			newElement = Arrays.copyOf(elements, size * 2);
			elements = newElement;
		}
	}

	// Returns the number of elements in this list.
	public int size() {
		return elements.length;
	}

	// Returns whether the list is empty.
	public boolean isEmpty() {
		return (size == 0);
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException();
		return elements[i];
	}

	// Replaces the element at index i with e, and returns the replaced element. ∗/
	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException();
		return elements[i] = e;
	}

	// It is used to append the specified element at the end of a list.
	public boolean add(E e) {
		if (size == elements.length)
			growSize();
		elements[size++] = e;
		return true;
	}

	// Inserts element e to be at index i, shifting all subsequent elements later.
	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i > size || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (size == elements.length) {
			growSize();
		}
		for (int j = size - 1; j > i; j--) {
			elements[j + 1] = elements[j];
		}
		elements[i] = e;
		size++;
	}

	// Removes and returns the element at index i, shifting subsequent elements
	// earlier.
	public E remoVe(int i) throws IndexOutOfBoundsException {
		if (i >= this.size || i < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			E removeElement = elements[i];
			for (int j = i; j < size; j++) {
				elements[j] = elements[j + 1];
			}
			return removeElement;
		}
	}

	// It is used to clear all elements in the list.
	public void clear() {
		size = 0;
	}

// It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
	public int lastIndexOf(Object o) {
		int index = 0;
		for (int i = size - 1; i >= 0; i--) {
			if (elements[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	// It is used to return an array containing all of the elements in this list in
	// the correct order.

	public E[] toArray() {
		E[] array = (E[]) new Object();
		for (int i = 0; i < size; i++) {
			array[i] = elements[i];
		}
		return array;
	}

	// It is used to return a shallow copy of an ArrayList.
	public MyArrayList<E> clone() {
		MyArrayList<E> cloneList = new MyArrayList<>(elements, size);

		return cloneList;
	}

	// It returns true if the list contains the specified element
	public boolean contains(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o)) {
				return true;
			}
		}
		return false;

	}

	// It is used to return the index in this list of the first occurrence of the
	// specified element, or -1 if the List does not contain this element.
	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o))
				return i;
		}
		return -1;
	}

	// It is used to remove the first occurrence of the specified element.
	public boolean remove(E e) {
		int index = indexOf(e);
		int check = 0;
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(e))
				check++;
			if (elements[i].equals(e) || i == index) {
				break;
			}
		}
		return (check == 1);
	}

	// It is used to sort the elements of the list on the basis of specified
	// comparator.
	public void sort(Comparator<E> c) {
		Arrays.sort(elements, 0, size, c);
	}

	public static void main(String[] args) {
		MyArrayList<Integer> myArray = new MyArrayList<>();
		myArray.add(3);
		myArray.add(34);
		myArray.add(33);
		myArray.add(33);
		myArray.add(2, 23);
		// myArray.remove();

		for (int i = 0; i < myArray.size; i++) {
			System.out.print(myArray.get(i) + " ");
		}
		// System.out.println(myArray.lastIndexOf(33));
		System.out.println(myArray.size);
		// System.out.println(myArray.remoVe(2));
		// System.out.println(myArray.indexOf(33));
		// System.out.println(myArray.remove(33));
		// System.out.println(myArray.get(3));
		// System.out.println(myArray.size);
	}

}
