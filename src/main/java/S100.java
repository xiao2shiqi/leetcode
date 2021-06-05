/**
 * #100. Same Tree
 * https://leetcode-cn.com/problems/same-tree/
 */
public class S100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p != null && q != null && p.val == q.val) {
            //递归遍历左子树和右子树
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        n2.left = null;
        n2.right = new TreeNode(2);
        System.out.println("isTrue > " + isSameTree(n1, n2));

    }
}
