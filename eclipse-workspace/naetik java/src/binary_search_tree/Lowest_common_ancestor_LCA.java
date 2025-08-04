package binary_search_tree;

public class Lowest_common_ancestor_LCA {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
				return null; // agar main root hi null hai toh kya ghante ka ancestor
			}
			if (root == p || root == q) { // say mujhe 7 and 4 dhudna tha toh mai bolunga apna ki kya at present root
											// par jaha hum khade hai voh root 7 ya 4 hai agar hai toh uska root return
											// karde yani ki 2 agar nai hai toh loop nahi chalega
				return root;
			}
			TreeNode left = lowestCommonAncestor(root.left, p, q); // left mai dhund ki 7 ya 4 mil raha hai kya
			TreeNode right = lowestCommonAncestor(root.right, p, q); // right mai dhund ki 7 ya 4 mil raha hai kya
			if (left != null && right != null) { // kya root ka left not equal to null hai haa bhai toh loop
															// chalega mtlb left aur right mai elemnet honge toh hi lop
															// chalega
				return root; // so 7,4 ka root return kardo 2 aah gaya yehi ancestor hai // agar 7 aur 4 mil
								// gaya toh uska root return kardo babua
//				aisa bhi ho sakta hai ki hum koi aise root par khade ho jiske left aur ight dono hi null ho toh for that hume kuch toh karna padega code abhi for example 6 wala root 
				// basically say we found 7 so 2 ke left mai 7 ka address gaya aur 2 ke right
				// mai 4 ka address gaya indono ka and lenge aur 2 ko return karnege lekin ab
				// dekh 6 ki taraf sai toh null jayega right aur 2 bolega ki meri taraf sai 2
				// aaya hai toh humme kuch aisa likhna padega ki 2,null hoga toh 2 hi return
				// hoye so humme yeh samjh aah raha hai ki agar left null hai toh right mai
				// paaka address hoga aur agar right null hai toh left mai address hoga note yeh
				// left right mai left wale portion mai hi bol raha hu

			} else if (left == null) {
				return right;
			} else {
				return left;
			} // iss sai dono case cover hogaye ek ki agar 6 mtlb root ke left aur right dono
				// hi null hai toh kya karenge
//aur ek yeh ki agar left null hai toh paaka right mai address hoga aur agar right null hai toh paaka left mai address hoga 

		}
	}

//	dekh pura samjha raha hu mai ab 
//	we are searching 7,4 ancestor 
//	notebook mai tree ban raha hai uske according values bolunga mai 
//	hum aaye 3 par check kia ki kya yeh root==null hai no aage bade next if par aaye (2nd if par aaye) check kia ki kya 3 ==7 ya 4 hai na bhai 
//	left mai call lagaya 3 ke 5 par gaye dekha ki null toh nai nahi hai aage bade 2nd if par aaye check kia ki 5 == 7 ya 4 hai no bhai 
//	5 ke left mai call lagaya 6 par gaye humne kaha ki null toh nai hai yeh nahi null nahi hai 2nd if par gaye pucha ki 6==7 ya 4 toh nai hai nahi bhai nahi hai 
//	6 ke left mai gaye humne kaha ki null hogaya toh else if wali line chalegi ki if left == nul hai toh right return karo 6 ka hi toh 6 ka right bhi null hai toh null null return kargea 6 null hi 
//	fir 5 par aaye vapas right ka call lagaya 2 par aaye check kia ki null toh nai nahi hai 2==7 ya 4 toh nahi nope 
//	left ka call lagya 2 sai toh ab root joh hai voh 7 ban gya check kia ki 7==7 hai yes toh 7 ki taraf sai 7 ka address return hua 
//	2 ke left mai hume 7 ka address mil gaya 
//	2 ke right mai check kia ab 4 root ban gaya hai toh 4==q that is 4 yes toh 4 ne bhi apna address return kia 2 ke right mai 4 ka address hai 
//	ab 2 bolega ki bhai root.left!= null hai yes root.right!=null hai yes toh return karde root yani 2 apna address 2k return karega so ab humare paas null 6 saia aya tha aur 2k from 2 
//	fir humne kaha ki kya left 5 ka null hai ha toh 5 ka right return karde toh humne 2k return kardia 
//	fir hum gaye right portion mai 3 sai call gaya 1 par kya null hai no kya 1==7 ya 4 hai no toh 1 nai apne left ko call dia check kia ki null hai nai 0==7 ya 4 hai no toh 0 nai apne left ko call dia waha sai left==null chala toh 0 sai null aya fir hum 
//	vapas sai 1 par aaye right ka call lagaya kaha ki 8 == null hai no fir 8==7 ya 4 hai no toh 8 ani apne right ko call lagaya 
//	ki kya null hai toh yes toh 8 ki taraf sai bhi null aya 0 sai bhi null indono ka and lia 1 ki taraf sai null aya aur 3 ki yani left portion ki taraf sai 2k toh
//	check kia 3 main root nai ki kya 3 ka left null hai no toh kya 3 ka right null hai yes toh left return kardo toh 3 mai 2k aah gaya hoga simpleee
//	 paytm ka sabai favourite question hai yeh babu

}
