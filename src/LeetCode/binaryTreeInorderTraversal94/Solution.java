package LeetCode.binaryTreeInorderTraversal94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Example usage
        LeetCode.binaryTreeInorderTraversal94.TreeNode root = new LeetCode.binaryTreeInorderTraversal94.TreeNode(1);
        root.right = new LeetCode.binaryTreeInorderTraversal94.TreeNode(2);
        root.right.left = new LeetCode.binaryTreeInorderTraversal94.TreeNode(3);

        List<Integer> result = inorderTraversal(root);
        System.out.println("Inorder Traversal Result: " + result);
    }
    public static List<Integer> inorderTraversal(LeetCode.binaryTreeInorderTraversal94.TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }
    private static void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderTraversalRecursive(node.left, result);
            result.add(node.val);
            inorderTraversalRecursive(node.right, result);
        }
    }
}
