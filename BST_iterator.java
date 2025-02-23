//Time complexity: o(1) to o(N)

//Space complexity: o(H)

class BSTIterator {
    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        dfs(root);
        
    }
    
    public int next() {
        TreeNode result = st.pop();
        dfs(result.right);
        return result.val;
    }
    
    
    public boolean hasNext() {
        return !st.isEmpty();
        
    }
    private void dfs(TreeNode root){
        while(root!= null){
            st.push(root);
            root = root.left;
        }
    }
}
