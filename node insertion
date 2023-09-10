class Solution
{
    public:
       Node* insert(Node* node, int data) {
            // Your code goes here
            Node* temp=new Node(data);
            Node* parent=NULL;
            Node* curr=node;
            while(curr!=NULL)
            {
                parent=curr;
                if(curr->data>data)
                {
                    curr=curr->left;
                }
                else if(curr->data<data)
                {
                    curr=curr->right;
                }
                else
                return node;
            }
            
            if(parent==NULL)
            {
                return temp;
            }
            else if(parent->data>data)
            {
                parent->left=temp;
            }
            else
            {
                parent->right=temp;
            }
            
            return node;
    }

};
