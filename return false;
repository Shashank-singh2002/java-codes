class Solution
{
    public:
    //Function to check if two trees are identical.
    bool isIdentical(Node *r1, Node *r2)
    {
        if( r1== NULL && r2 == NULL){
            return true;
        }
        else if( r1== NULL && r2 != NULL){
            return false;
        }
        else if( r1 != NULL && r2 == NULL){
            return false;
        }
        bool left = isIdentical(r1->left, r2->left);
        bool right = isIdentical(r1->right, r2->right);
        bool val = r1->data == r2->data;
        if( left && right && val){
            return true;
        }
        else{
            return false;
        }
    }
};
