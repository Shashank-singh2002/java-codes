class Solution
{
private:

public:

    void atLevelK(Node* root, int k, vector<int> &ans){
        if(root){
            if(k==0) ans.push_back(root->data);
            atLevelK(root->left,k-1,ans);
            atLevelK(root->right,k-1,ans);
        }
    }
    
    int helper(Node* root, int k, vector<int> &ans, int target, bool &t){
        if(root==NULL) return -1;
        
        if(!t and root->data==target){
            atLevelK(root,k,ans);
            t = true;
            return 1;
        }
        
        int l = helper(root->left,k,ans,target,t);
        int r = helper(root->right,k,ans,target,t);
        
        if(l==-1 and r==-1) return -1;
        
        else if(r==-1){
            if(k-l==0){
                ans.push_back(root->data);
                return -1;
            }
            else atLevelK(root->right,k-l-1,ans);
            return l+1;
        }
        
        else{
            if(k-r==0){
                ans.push_back(root->data);
                return -1;
            }
            else atLevelK(root->left,k-r-1,ans);
            return r+1;
        }
    }

public:

    vector <int> KDistanceNodes(Node* root, int target , int k){
        vector<int> ans;
        bool t = false;
        helper(root,k, ans,target,t);
        sort(ans.begin(),ans.end());
        return ans;
    }
};
