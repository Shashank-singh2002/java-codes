class Solution{
    public:
    //Function to check whether a binary tree is balanced or not.
    pair<bool,int> isBalancedFast(Node* root){
        if(root==NULL){
            pair<bool,int> p = make_pair(true,0);
            return p;
        }
       pair<bool,int> left =  isBalancedFast(root->left);
       pair<bool,int> right =  isBalancedFast(root->right);
       bool op1 = left.first;
       bool op2 = right.first;
       bool op3 = abs(left.second - right.second) <= 1;
       pair<bool,int> ans;
       if(op1 && op2 && op3){
           ans.first = true;
       }
       else{
           ans.first = false;
       }
       ans.second = max(left.second , right.second) + 1;
       return ans;
    }
    bool isBalanced(Node *root)
    {
        return isBalancedFast(root).first;
    }
};
