class Solution
{
    public:
    Node* pairWiseSwap(struct Node* head) 
    {
        Node*prev=NULL;
       Node*curr=head;
       Node*forward=NULL;
       int cnt=0;
       while(curr!=NULL && cnt<2){
           forward=curr->next;
           curr->next=prev;
           prev=curr;
           curr=forward;
           cnt++;
       }
       if(forward!=NULL){
           head->next=pairWiseSwap(forward);
       }
       return prev;
    }
};
