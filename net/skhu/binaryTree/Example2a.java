package net.skhu.binaryTree;

public class Example2a {
	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public void add(int value) {
			if (value < this.value) {
				if (left == null)
					left = new Node(value);
				else
					left.add(value);
			} else if (value > this.value) {
				if (right == null)
					right = new Node(value);
				else
					right.add(value);
			}
		}

		public void print() {
			if (left != null)
				left.print();
			System.out.printf("%d ", value);
			if (right != null)
				right.print();
		}

		public boolean contains(int value) {
			if (value < this.value)
				return left != null && left.contains(value);
			else if (value > this.value)
				return right != null && right.contains(value);
			return true;
		}

		public int getLeftMostValue() {
			if (this.left != null)
				return this.left.getLeftMostValue();
			return this.value;
		}

		public void remove(int value, Node parent) {
			if (value < this.value) {
				if (left != null)
					left.remove(value, this);
			} else if (value > this.value) {
				if (right != null)
					right.remove(value, this);
			} else {
				if (left != null && right != null) {
					int temp = right.getLeftMostValue();
					this.value = temp;
					right.remove(temp, this);
				} else {
					Node child = (left != null) ? left : right;
					if (parent.left == this)
						parent.left = child;
					else
						parent.right = child;
				}
			}
		}
	}

	static class BinaryTree {
		Node root;

		public void add(int value) {
			if (root != null)
				root.add(value);
			else
				root = new Node(value);
		}

		public void print() {
			if (root != null)
				root.print();
			System.out.println();
		}

		public boolean contains(int value) {
			return root != null && root.contains(value);
		}

		public void remove(int value) {
			Node dummy = new Node(Integer.MAX_VALUE);
			dummy.left = root;
			root.remove(value, dummy);
			if (dummy.left != root)
				root = dummy.left;
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 18, 1, 12, 7, 2, 14, 6, 9, 15 };
		BinaryTree binaryTree = new BinaryTree();
		for (int i = 0; i < a.length; ++i)
			binaryTree.add(a[i]);
		binaryTree.print();
		binaryTree.remove(14);
		binaryTree.remove(15);
		binaryTree.remove(5);
		binaryTree.remove(10);
		System.out.println();
		binaryTree.print();
		System.out.println();
	}
}