class Solution {
public:
    vector<long long> findPrefixScore(vector<int>& nums) {
        vector<long long> ans;
        long long sum=0,max=0;
        for(auto it:nums){
            if(max<it)
            {
                max=it;
            }
            sum+=it+max;
            ans.push_back(sum);
        }
        return ans;
    }
};
