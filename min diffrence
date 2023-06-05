class Solution
{
    public:
    int minDiff(Node *root, int k){
        int diff=INT_MAX;
        Node* curr=root;
        while (curr!=NULL){
            if (curr->data==k) return 0;
            else if (curr->data<k){
                diff=min(diff, k-curr->data);
                curr=curr->right;
            }
            else if (curr->data>k){
                diff=min(diff, curr->data-k);
                curr=curr->left;
            }
        }
        return diff;
    }
};
