class Solution{
  public:
    void inorder(Node* root, vector<int> &v) {
        if(!root) return;
        inorder(root->left, v);
        v.push_back(root->data);
        inorder(root->right, v);
    }
    void toBST(Node *root, int &i, vector<int> &v) {
        if(!root) return;
        toBST(root->left, i, v);
        root->data = v[i++];
        toBST(root->right, i, v);
    }
    Node *binaryTreeToBST (Node *root)
    {
        //Your code goes here
        vector <int> v;
        inorder(root, v);
        sort(v.begin(), v.end());
        int i = 0;
        toBST(root, i, v);
        return root;
    }
};
