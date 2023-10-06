class Solution
{
    public:
    void rearrange(struct Node *odd)
    {
       Node*i = odd;
       Node*j = odd->next;
       if(!j || j->next==NULL){return;}
       Node*prevJ = NULL;
       while(i!=NULL and j!=NULL){
           i->next = j->next;
           i = j->next;
           j->next = prevJ;
           prevJ = j;
           if(i!=NULL){
               if(i->next){j=i->next;}
               else{i->next = j;break;}
           }
           else{
               break;
           }
           if(j->next==NULL){
               j->next = prevJ;
               break;
           }
       }
    }
};
