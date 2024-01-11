package LeetCode.maximumDifferenceBetweenNodeAndAncestor;

public class Solution {
    public static void main(String[] args) {

    }
    public static int maxAncestorDiff(TreeNode root) {
        return helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    public static int helper(TreeNode root, int min, int max) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int left = helper(root.left, min, max);
        int right = helper(root.right, min, max);

        return Math.max(max - min, Math.max(left, right));
    }
    public static class TreeNode {
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
}
