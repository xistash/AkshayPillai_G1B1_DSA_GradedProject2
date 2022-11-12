package binarySearchTreeMNC;
class Node {
	Node left;
	Node right;
	int data;

	Node(int key) {
		left = null;
		data = key;
		right = null;
	}
}

public class BST {

		Node node;
		Node prev = null;
		Node Head = null;

		void BinaryTree(Node root) {
			if (root == null) {
				return;
			}
			Node leftNode = root.left;
			BinaryTree(leftNode);
			Node rightNode = root.right;
			if (Head == null) {
				Head = root;
				root.left = null;
				prev = root;
			} else {

				prev.right = root;
				root.left = null;
				prev = root;
			}
			BinaryTree(rightNode);
		}
		
		void traverseTree(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			traverseTree(root.right);
		}
 
		public static void main(String[] args) {
			BST tree = new BST();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left = new Node(55);

			tree.BinaryTree(tree.node);
			
			System.out.println("OutPut: \n--------------");
			tree.traverseTree(tree.Head);
		}

	}


