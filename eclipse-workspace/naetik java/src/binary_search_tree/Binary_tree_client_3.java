package binary_search_tree;

public class Binary_tree_client_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	Binary_tree3 bt  = new Binary_tree3(); //object 
     	bt.Display();
     	System.out.println(bt.Maximum());
     	System.out.println(bt.find(65));
     	System.out.println(bt.ht());
     	bt.preOrder();
     	bt.PostOrder();
     	bt.InOrder();
     	bt.LevelOrder();
	}

}
