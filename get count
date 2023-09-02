class Solution
{
public:
    int getCount(Node *root, int k)
    {
         int level=0;
        int count=0;
        queue<Node*>q;
        q.push(root);
        while(!q.empty()){
            int size=q.size();
            level++;
                while(size>0){
            
                    Node* temp=q.front();
                    q.pop();
                    if(!temp->left && !temp->right){
                        if(level<=k){
                           count++;
                           k=k-level;
                        }
                        
                        
                    }
                   if(temp->left) q.push(temp->left);
                   if(temp->right)q.push(temp->right);
                   size--;
                }
            }
            
        return count;
    }
};
