package blind_45_days_sheet;

public class balanced_binary_tree_optimized{
	
	* public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }
		
		class Solution {
		    public boolean isBalanced(TreeNode root) {
		    	return Balanced(root).balanced;
		        
		    }
		    public balancedpair Balanced(TreeNode root) {
		    	if(root==null) {
		    		return new balancedpair();
		    	}
		    	balancedpair lbp = Balanced(root.left);
		    	balancedpair rbp = Balanced(root.right);
		    	balancedpair sbp = new balancedpair();
		    	sbp.height = Math.max(lbp.height,rbp.height)+1;
		    	boolean sb = Math.abs(lbp.height-rbp.height) <=1;
		    	sbp.balanced = lbp.balanced && rbp.balanced && sb;
		    	return sbp;	
		    }
		    class balancedpair{
		    	boolean balanced = true;
		    	int height = -1;
		    }
		}

}
