package blind_45_days_sheet;

public class path_sum_3 {

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
		public int pathSum(TreeNode root, int targetSum) { // fix root
			if (root == null) {
				return 0;
			}

			int count = countpath(root, (long)targetSum); // iss fixed root sai kitne path ban rahe hai joh target ke equal hai 

			count += pathSum(root.left, targetSum); // ek baar left node ko root bana aur check kar ki kitne path ban rahe hai 
			count += pathSum(root.right, targetSum); // ek baar right node ko root bana aur check kar ki kitne path ban rahe hai 
			return count;

		}

		private int countpath(TreeNode root, long target) { 
			if (root == null) {
				return 0;
			}
			int count = 0;
			if (root.val == target) {
				count++;
			}
			count += countpath(root.left, target - root.val);
			count += countpath(root.right, target - root.val);

			return count;
		}
	}
//Har node ko ek-ek karke STARTING ROOT fix karta hai. path sum
//Us particular fixed root se KITNE downward paths targetSum banate hain, yeh count karta hai.	
	
}
