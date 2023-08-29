class Solution
{
    public:
    Node* reverse(Node* head){
        Node* pre=NULL,*curr=head,*nxt=head->next;
        while(nxt!=NULL){
            curr->next=pre;
            pre=curr;
            curr=nxt;
            nxt=nxt->next;
        }
        curr->next=pre;
        return curr;
    }
    Node *compute(Node *head)
    {   
        if(head==NULL||head->next==NULL) return head;
        Node* curr=reverse(head);
        int cnt=curr->data;
        head=curr;
        while(curr!=NULL){
            Node* p1=curr->next;
            while(p1!=NULL &&cnt>p1->data){
                p1=p1->next;
            }
            curr->next=p1;
            curr=p1;
            if(p1!=NULL) cnt=p1->data;
        }
        head=reverse(head);
        
        return head;
    }
    
};
