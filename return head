class Solution{
  public:
    // Should return head of the modified linked list
    Node *sortedInsert(struct Node* head, int data) {
        Node * newnode= new Node(data);
        newnode->next = head;
        Node* temp = newnode;
        if(head->data >= data){
            head = newnode;
        }
        else{
        while(temp!=NULL and temp->next!=NULL and temp->next->data <= data){
            temp = temp->next;
        }
        newnode->next=temp->next;
        temp->next = newnode;
        }
        return head;
    }
    };
