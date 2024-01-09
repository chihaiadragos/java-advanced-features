package LeetCode.LeafSimilarTrees872;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafSequence1 = new ArrayList<>();
        List<Integer> leafSequence2 = new ArrayList<>();
        generateLeafSequence(root1, leafSequence1);
        generateLeafSequence(root2, leafSequence2);
        return leafSequence1.equals(leafSequence2);
    }
    private static void generateLeafSequence(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        generateLeafSequence(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        generateLeafSequence(root.right, list);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
