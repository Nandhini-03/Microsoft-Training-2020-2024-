class Solution {
    int[] preOrder;
    int[] inOrder;
    Map<Integer,Integer> map=new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder=preorder;
        inOrder=inorder;
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=dfs(0,n-1);
        return root;
    }
    public TreeNode dfs(int s,int e){
        if(s>e){
            return null;
        }
        int curVal=preOrder[index++];
        TreeNode curr=new TreeNode(curVal);
        int mid=map.get(curVal);
        curr.left=dfs(s,mid-1);
        curr.right=dfs(mid+1,e);
        return curr;
    }
}
