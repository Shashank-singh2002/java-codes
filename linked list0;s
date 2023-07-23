class Solution
{
    public:
    //Function to sort a linked list of 0s, 1s and 2s.
    Node* segregate(Node *head) {
        
        map<int,int>hmap;
        Node*curr=head;
        while(curr){
            hmap[curr->data]++;
            curr=curr->next;
        }
        Node*dummy=new Node(-1);
        Node*temp=dummy;
        for(auto &it:hmap){
            int k=it.second;
            while(k--){
                temp->next=new Node(it.first);
                temp=temp->next;
            }
        }
        return dummy->next;
        
    }
};
