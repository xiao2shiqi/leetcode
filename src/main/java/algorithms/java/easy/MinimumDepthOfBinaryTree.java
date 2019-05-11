package algorithms.java.easy;

public class MinimumDepthOfBinaryTree {

    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) {
            val = x;
        }
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //二叉树最大深度，递归解决，时间：O（N）
        int left_height = minDepth(root.left);
        int right_height = minDepth(root.right);
        return Math.min(left_height, right_height) + 1;
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(3);
        rootNode.left = new TreeNode(9);
        rootNode.right = new TreeNode(20);
        rootNode.right.left = new TreeNode(15);
        rootNode.right.right = new TreeNode(7);
        System.out.println("maxDepth > " + minDepth(rootNode));
    }
}
