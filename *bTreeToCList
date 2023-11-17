class Solution
{
    pair<Node*, Node*> solve(Node* root)
    {
        if(root -> left == NULL and root -> right == NULL)
            return {root, root};
        if(root -> left == NULL)
        {
            pair<Node*, Node*> right = solve(root -> right);
            root -> right = right.first;
            right.first -> left = root;
            return {root, right.second};
        }
        if(root -> right == NULL)
        {
            pair<Node*, Node*> left = solve(root -> left);
            left.second -> right = root;
            root -> left = left.second;
            return {left.first, root};
        }
        pair<Node*, Node*> left = solve(root -> left);
        pair<Node*, Node*> right = solve(root -> right);
        left.second -> right = root;
        root -> left = left.second;
        root -> right = right.first;
        right.first -> left = root;
        return {left.first, right.second};
    }
  public:
    //Function to convert binary tree into circular doubly linked list.
    Node *bTreeToCList(Node *root)
    {
    //add code here.
        if(root == NULL)
            return NULL;
        pair<Node*, Node*> res = solve(root);
        res.first -> left = res.second;
        res.second -> right = res.first;
        return res.first;
    }
};
