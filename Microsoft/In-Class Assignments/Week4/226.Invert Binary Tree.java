class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        invert (root);
        return root;
    }
    public void invert(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode holder=root.left;
        root.left=root.right;
        root.right=holder;
        invert(root.left);
        invert(root.right);
    }
}
