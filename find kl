class Solution
{
    public:
    Node* findKL(Node *root, int& K){
        if(root==NULL){
            return root;
        }
        
        Node* rs = findKL(root->right, K);
        if(rs != NULL){
            return rs;
        }
        
        K--;
        if(K==0){
            return root;
        }
        
        return findKL(root->left, K);
    }
    
    int kthLargest(Node *root, int K)
    {
        Node* ans = findKL(root, K);
        return ans->data;
    }
};
