package LeetCode.pseudoPalindromicPathsInABinaryTree1457;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
//        System.out.println(pseudoPalindromicPaths());
    }
    static int count = 0;
    public static int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> nodes = new HashSet<>();
        helper(root, nodes);
        return count;
    }
    public static void helper(TreeNode node, Set<Integer> nodes){
        if (node == null) {
            return;
        }
        if (nodes.contains(node.val)) {
            nodes.remove(node.val);
        }
        else {
            nodes.add(node.val);
        }
        if (node.left == null && node.right == null) {
            if (nodes.size() == 0 || nodes.size() == 1) {
                count++;
            }
        }
        helper(node.left, new HashSet(nodes));
        helper(node.right, new HashSet(nodes));
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