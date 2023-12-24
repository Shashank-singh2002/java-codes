class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        vector<pair<int, int>> v;
        int cnt=0, tmp;
        for(int i=0; i<n; i++){
            v.push_back(make_pair(price[i], i));
        }
        sort(v.begin(), v.end());
        for(int i=0; i<n; i++){
            tmp=v[i].second;
            while(tmp>=0){
                if(k<v[i].first) return cnt;
                k-=v[i].first;
                tmp--;
                cnt++;
            }
        }
        return cnt;
    }
};
