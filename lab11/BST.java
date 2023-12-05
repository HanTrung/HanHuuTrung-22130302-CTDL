package tuan11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}
	


	// Add element e into BST
	public void add(E e) {
		if (root == null)
			root = new BNode(e);
		else
			root.add(e);
	}

// Add a collection of elements col into BST

	public void add(Collection<E> col) {
		for (E e : col) {
			add(e);
		}
	}

// compute the depth of a node in BST
	public int depth(E node) {
		if (root != null)
			return root.depth(node);
		return -1;
	}

// compute the height of BST
	public int height() {

		return -1;
	}

// Compute total nodes in BST
	public int size() {
		if (root != null)
			return root.size();
		return -1;
	}

// Check whether element e is in BST
	public boolean contains(E e) {
		return contains(e);
	}

// Find the minimum element in BST
	public E findMin() {
		return findMin();
	}

// Find the maximum element in BST
	public E findMax() {

		return findMax();
	}

// Remove element e from BST
	public boolean remove(E e) {
		return remove(e);
	}

// get the descendants of a node
	public List<E> descendants(E data) {
		return descendants(data);
	}

// get the ancestors of a node
	public List<E> ancestors(E data) {
		return ancestors(data);
	}

	private void inorderTraversal(BNode<E> node) {
		if (node != null) {
			inorderTraversal(node.getLeft());
			System.out.print(node.getData() + " ");
			inorderTraversal(node.getRight());
		}
	}

	public void inOrder() {
		inorderTraversal(root);
	}

	private void preorderTraversal(BNode<E> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preorderTraversal(node.getLeft());
			preorderTraversal(node.getRight());
		}
	}

	public void preOrder() {
		preorderTraversal(root);
	}

	private void postorderTraversal(BNode<E> node) {
		if (node != null) {
			postorderTraversal(node.getLeft());
			postorderTraversal(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public void postOrder() {
		postorderTraversal(root);
	}

	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		bst.add(25);
		bst.add(15);
		bst.add(10);
		bst.add(4);
		bst.add(12);
		bst.add(22);
		bst.add(18);
		bst.add(24);
		bst.add(50);
		bst.add(35);
		bst.add(31);
		bst.add(44);
		bst.add(70);
		bst.add(66);
		bst.add(90);
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.preOrder();
		System.out.println();
		bst.postOrder();
	}
}