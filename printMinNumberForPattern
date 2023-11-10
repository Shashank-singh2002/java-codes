class Solution{   
public:
    string printMinNumberForPattern(string S){
         int maxi = 0;
        int i = 0;
        vector<int> v;
        string s;
        bool from_I = false;
        
        if(S[0] == 'I') 
        {
            from_I = true;
            v.push_back(1);
            maxi = 1;
        }
        
        while(i < S.size())
        {   
            if(S[i] == 'I')
            {
                from_I = true;
                int c = 0;
                for(int j = i+1; j < S.size(); j++)
                {
                    if(S[j] == 'D')
                    {
                        c++;
                    }
                    else break;
                }
                v.push_back(c + 1 + maxi);
                maxi = c + 1 + maxi;
                i++;
            }
            else
            {
                if(from_I)
                {
                    int c = 0;
                    int temp = maxi;
                    while(S[i] == 'D')
                    {
                        temp = temp - 1;
                        v.push_back(temp);
                        i++;
                    }
                }
                else
                {
                    int c = 0;
                    for(int j = i; j < S.size(); j++)
                    {
                        if(S[j] == 'D')
                        {
                            c++;
                        }
                        else break;
                    }
                    maxi = maxi + c + 1;
                    int temp = maxi;
                    for(int j = i; j < i + c; j++)
                    {
                        v.push_back(temp);
                        temp--;
                    }
                    v.push_back(1);
                    i = i + c;
                }
            }
        }
        for(auto i : v)
        {
            s.push_back(i + '0');
        }
        return s;
    }
};
