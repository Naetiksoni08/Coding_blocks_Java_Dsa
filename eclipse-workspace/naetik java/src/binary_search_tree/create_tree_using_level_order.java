package binary_search_tree;

import java.util.*;

import binary_search_tree.Binary_tree3.Node;

public class create_tree_using_level_order {
	class Node {
		Node left;
		Node right;
		int val;

	}

	private Node root;

	public create_tree_using_level_order() {
		create_tree();
	}

	public void create_tree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item; // yeh nai karna padhta agar humare pass this.val = val hota seedha new node(item) pass kardete 
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.remove(); // poll bhi kr sakte hai remove first karta hai poll bhi
			int c1 = sc.nextInt(); // 2 child ke input liye
			int c2 = sc.nextInt();
			if (c1 != -1) { // agar minus 1 nahi hai that means child 1 exists agar -1 hota toh mtlb null hota 
				Node node = new Node();
				node.val = c1; // c1 ki value assign kardi node.val mai 
				rv.left = node; // jisko remove kiye ho uske left mai value daal do 
				q.add(node);
//ek baat dhyan rk hum ek actual tree bana rahe hai so basically joh yeh bol rahe hai na ki c1 ko val daldo aur 10 ke left mai ek line bana ke node yani c1 ko laga do so 10 ke left mai 20 aur right mai 30
//20 jaise hi lagega usko remove kardenge aur fir 20 ke liye 2 input read karenge so 2 ke left mai 40 right mai 50
//30 ko remove karenge c1 -1 hai toh 2nd if par aaye aur uske right mai humne 70 laga diya
//40 ko remove karenge 2 input read karenge dono hi -1 hai toh bye bye if nai chalega
//fir 50 nikalenge 2 input read karenge 60 and -1 first if chalega 50 ke left  mai 60 aah gaya aur 60 ko queue mai daal dia
//fir 70 remove karenge dono -1 hai chodh denge 
//fir last mai 60 ko remove karenge dono -1 hai toh if nahi chalega aur iske baad loop nahi chalega kyuki queue is emptyyy
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val =c2;
				rv.right = node;
				q.add(node);
			}
		}
	}
		public void Display() {
			Display(root);
		}

		private void Display(Node nn) { 
			if (nn == null) {
				return;
			}
			String s = "";
			s = "<--" + nn.val + "-->";
			if (nn.left != null) {
				s = nn.left.val + s;
			} else {
				s = "." + s;
			}
			if (nn.right != null) {
				s = s + nn.right.val;
			} else {
				s = s + ".";
			}
			System.out.println(s);
			Display(nn.left);
			Display(nn.right);
		

	}
		public static void main(String[] args) {
			create_tree_using_level_order cl = new create_tree_using_level_order();
			cl.Display();
		}

}



//basically we are given with a input and we have to construct a tree using that input that input is level order wala input 
//jaha jaha -1 hoga vaha vaha value nai hai mtlb null hai 
//input hai 10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1
