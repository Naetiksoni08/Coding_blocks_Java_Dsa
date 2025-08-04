package binary_search_tree;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary_tree3 {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Binary_tree3() { // constructor
		root = CreateTree();

	}

	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		Boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree(); // iss sai vapas node banega control jayega seedha line 22 par
		}
		Boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree(); // iss sai vapas node banega control jayega seedha line 22 par
		}
		return nn;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) { // jab mai client mai bt.Display(nn); yeh karunga toh nn ko na root ka address
									// chahiye hoga but root joh hai voh tph private ab ek option hai ki mai usse
									// public bana du but public abna dunga toh kpoi bhi aakar mere root ko null kr
									// sakta hai toh development ke mindset sai galat hai voh toh ab mai kya kaurnga
									// na ki mai same naam ka display method bana dunga non parameterized aur joh
									// main display method hai usko mai private bana dunga aur dummy display mai
									// call karulunga toh isse mera code bhi dikh jayega compiler ko aur koi aur bhi
									// misuse nai kr sakta kyuki usse sirf aur sirf mera dummy diplay ke andar
									// another diplay dikhega
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

	public int Maximum() {
		return Max(root);
	}

	private int Max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE; // because leaf node joh hoga voh bhi toh kuch layega so left wala - infinity
										// layega right wala -infinity layega
		}
		int lmax = Max(node.left); // left ka maximum
		int rmax = Max(node.right);// right ka maximum
		return Math.max(node.val, Math.max(lmax, rmax)); // left ka right ka aur root ka mazimum
	}

	public boolean find(int item) {
		return Find(root, item);
	}

	private boolean Find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.val == item) {
			return true;

		}
		Boolean left = Find(nn.left, item);
		Boolean right = Find(nn.right, item);
		return left || right;

		// we have to find ki ek tree mai item hai ya nai say 65 is there in the tree or
		// not
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1; // why -1 be cuz if 0 karunga return toh say 70 hai uske left aur right mai null
						// hai toh 0 left sai aya 0 right sai aya (0,0)++1 = 1 but agar single node hota
						// hai toh hume uski value 0 hi mani thi isliye (-1,-1)+1 = 0
		}
		int lht = ht(node.left);
		int rht = ht(node.right);
		return Math.max(lht, rht);

	}

	public void preOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node node) {
		if (node == null) {
			return;
		}

		PreOrder(node.left);
		System.out.print(node.val + " ");
		PreOrder(node.right);

	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");

	}

	public void LevelOrder() {
//		Queue<Node> q = new LinkedList<>();
		LinkedList<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove(); // remove first
			System.out.println(rv.val + " "); // print joh remove kia
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}

		System.out.println();
//		3 hi kaam karne the remove kara root node print krdia aur check karo ki kya root ka left aur right exist karta hai if yes then add kardo bas so remove kara print kara aur check 
	}

}
