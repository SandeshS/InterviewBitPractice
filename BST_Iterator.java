/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    private List<Integer> numbers = new ArrayList<Integer>();
    private int index = 0;
    
    private void inOrder(TreeNode r){
        if(r == null){
            return;
        }
        inOrder(r.left);
        numbers.add(r.val);
        inOrder(r.right);
    }
    
    public Solution(TreeNode root) {
        inOrder(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(index < numbers.size()){
            return true;
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        return numbers.get(index++);
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
