/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    if(a.size() == 0){
	        return null;
	    }
	    int mid = a.size()/2;
	    List<Integer> left = new ArrayList<Integer>();
	    List<Integer> right = new ArrayList<Integer>();
	    for(int i = 0; i<mid; i++){
	        left.add(a.get(i));
	    }
	    for(int i = (mid+1); i<a.size(); i++){
	        right.add(a.get(i));
	    }
	    TreeNode root = new TreeNode(a.get(mid));
	    root.left = sortedArrayToBST(left);
	    root.right = sortedArrayToBST(right);
	    return root;
	}
}