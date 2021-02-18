/**
 * #101 Symmetric Tree
 * see link : https://leetcode-cn.com/problems/symmetric-tree/
 * 和 #100. Same Tree 类似 使用递归解法 O(n)
 */
public class Solution101 {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return symmetric(root.left, root.right);
    }

    public static boolean symmetric(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return p == q ? true : false;
        //
        return p.val == q.val && symmetric(p.right, q.left) && symmetric(p.left, q.right);
    }

     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

    public static void main(String[] args) {
        //check demo
        TreeNode n1 = new TreeNode(1);
        TreeNode n2_left = new TreeNode(2);
        TreeNode n2_right = new TreeNode(2);
        n1.left = n2_left;
        n1.right = n2_right;

        TreeNode n3_left = new TreeNode(3);
        TreeNode n3_right = new TreeNode(4);
        n2_left.left = n3_left;
        n2_left.right = n3_right;
        n2_right.left = n3_right;
        n2_right.right = n3_left;

        System.out.println("isSymmetric(n1) > " + isSymmetric(n1));
    }
}