package binary_search_tree;

public class delete_node_in_a_BST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				//these 4 lines will work for both 0 child or one child
				if(root.left==null) {
					return root.right;
				}
				else if(root.right == null) {
					return root.left;
				}else {
					int min = min(root.right);
					root.right = deleteNode(root.right,min);
					root.val = min;
					
					
				}

			}
			return root;
		}
		public int min(TreeNode root) {
			if(root == null) {
				return Integer.MAX_VALUE;
			}
			int l = min(root.left);
			return Math.max(l,root.val);
			
		}
	}

}//bro in this question in order to delete a node first we will find the postion of the key once the key is found there will be 3 situation if the root have 0 child, child and 2 child if it has 0 and 1 child then the code is going to be same that if root.left is null then return root.right and vice versa 
// now if there 2 child then we need to find the minimum first so if root == null we will return +infinity (cuz we do reverse if min so return integer.max val and vice versa)
// so we will return the math.max of left subtree and the root note we wont go on the right side becuase this is a binary tree we know that on left side the values are smaller and we need to find the minimum so from there only we will get out minimum we wont get minimum from right if u want then u can traverse throught right too but think at the end whe u will do return math.max of left right and the root u will only get the value from the lef t
// then we will say in the else par that say we were at 15 we need to go on the right right mai jakar we will call minimum and say that give me  the minimum from the left anf right substree u will get 16 then 16 ko 15 par rakh denge 
// moreover humare na 2 trees banenge when we will delete 15 what we were doing was ki right kai minimum ko  15 par lakar rakh do and niche sai minimum delete kardo whose code was this what we did
// second tree we will say ki left potion mai maximum ko leke aao aur 15 ki jagah rakh do aur maximum delete kardo whose code i have done see it delete_node_in_a_BST_left_tree 
