package tuan11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> left;
	private BNode<E> right;

	public BNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/**
	 * @param data
	 * @param left
	 * @param right
	 */
	public BNode(E data, BNode<E> left, BNode<E> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getLeft() {
		return left;
	}

	public void setLeft(BNode<E> left) {
		this.left = left;
	}

	public BNode<E> getRight() {
		return right;
	}

	public void setRight(BNode<E> right) {
		this.right = right;
	}

	public void add(E e) {
		// TODO Auto-generated method stub
		if (e.compareTo(this.data) < 0) {
			this.right = new BNode(e);
		} else if (e.compareTo(this.data) > 0) {
			this.left = new BNode(e);
		}
	}

	boolean contain(E e) {
		int comp = e.compareTo(data);
		if (comp == 0)
			return true;
		else if (comp < 0) {
			if (left == null)
				return false;
			else
				left.contain(e);
		} else {
			if (right == null)
				return false;
			else
				right.contain(e);

		}
		return false;

	}

	List<E> descendants(E e) {
		int comp = data.compareTo(e);
		List<E> re = new ArrayList<E>();
		if (comp == 0) {
			if (left != null) {
				re.add(left.data);
				re.addAll(left.descendants(e));
			}
			if (right != null) {
				re.add(left.data);
				re.addAll(right.descendants(e));
			}
		}
		return null;
	}

	List<E> ancestors(E e) {
		int comp = e.compareTo(data);
		List<E> re = new ArrayList<E>();
		if (comp == 0)
			return re;
		if (left != null) {
			if (left.contain(e)) {
				re.add(data);
				re.addAll(left.ancestors(e));
			}
			if (right.contain(e)) {
				re.add(data);
				re.addAll(right.ancestors(e));
			}
		}
		return null;
	}

	public int depth(E node) {
		int comp = node.compareTo(data);
		if (comp == 0)
			return 0;
		else if (comp < 0) {
			return (left != null) ? 1 + left.depth(node) : -1;
		} else {
			return (right != null) ? 1 + right.depth(node) : -1;
		}
	}

	public int height() {
		int leftHeight = (left != null) ? 1 + left.height() : 0;
		int rightHeight = (right != null) ? 1 + right.height() : 0;
		return Math.max(leftHeight, rightHeight);
	}

	public int size() {
		int leftSize = (left != null) ? left.size() : 0;
		int rightSize = (right != null) ? right.size() : 0;
		return 1 + leftSize + rightSize;
	}

	public E findMin() {
		return (left != null) ? left.findMin() : data;
	}

	public E findMax() {
		return (right != null) ? right.findMax() : data;
	}

	public BNode<E> remove(E e) {
		int comp = e.compareTo(data);
		if (comp == 0) {
			if (left == null && right == null)
				return null;
			else if (left == null)
				return right;
			else if (right == null)
				return left;
			else {
				E minRight = right.findMin();
				this.data = minRight;
				this.right = this.right.remove(minRight);
			}
		} else if (comp < 0) {
			if (left != null)
				this.left = this.left.remove(e);
		} else {
			if (right != null)
				this.right = this.right.remove(e);
		}
		return this;
	}

   


}