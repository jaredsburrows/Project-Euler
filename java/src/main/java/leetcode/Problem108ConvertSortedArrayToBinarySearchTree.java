package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
 */
public final class Problem108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return getTreeNode(nums, 0, nums.length - 1);
    }

    private static TreeNode getTreeNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = getTreeNode(nums, start, mid - 1);
        node.right = getTreeNode(nums, mid + 1, end);
        return node;
    }
}
