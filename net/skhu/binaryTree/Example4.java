package net.skhu.binaryTree;

public class Example4 {
	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}

		public static Node add(Node n, int value) {
			if (n == null)
				return new Node(value);
			if (value < n.value)
				n.left = add(n.left, value);
			else if (value > n.value)
				n.right = add(n.right, value);
			return n;
		}

		public static void print(Node n) {
			if (n == null)
				return;
			print(n.left);
			System.out.printf("%d ", n.value);
			print(n.right);
		}

		public static boolean contains(Node n, int value) {
			if (n == null)
				return false;
			if (value < n.value)
				return contains(n.left, value);
			else if (value > n.value)
				return contains(n.right, value);
			return true;
		}

		public static int getLeftMostValue(Node n) {
			if (n.left == null)
				return n.value;
			return getLeftMostValue(n.left);
		}

		public static Node remove(Node n, int value) {
			if (n == null)
				return null;
			if (value < n.value)
				n.left = remove(n.left, value);
			else if (value > n.value)
				n.right = remove(n.right, value);
			else {
				if (n.left != null && n.right != null) {
					int temp = getLeftMostValue(n.right);
					n.value = temp;
					n.right = remove(n.right, temp);
				} else
					return (n.left != null) ? n.left : n.right;
			}
			return n;
		}
	}

	static class BinaryTree {
		Node root = null;

		public void add(int value) {
			root = Node.add(root, value);
		}

		public void print() {
			Node.print(root);
		}

		public boolean contains(int value) {
			return Node.contains(root, value);
		}

		public void remove(int value) {
			root = Node.remove(root, value);
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
	}
}