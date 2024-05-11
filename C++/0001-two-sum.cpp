#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> ump;
        for ( int i = 0; i<nums.size(); i++){
            if(ump.find(target - nums[i]) == ump.end())
                ump[nums[i]] = i;
            else
                return {ump[target - nums[i]], i};
        }
        return {};
    }
};

int main()
{
    Solution s;
    vector <int> a = {1 , 4 , 5 , 11 , 12};
    int target = 9;
    for(int &x : s.twoSum(a , target))
        cout << x << " ";
}

/*---------------------------------------------------------------------------------
TC: O(n) SC: O(n)

Intuition:

1. Simply traverse through all the element in array.
2. For each element in array search its complement is present in map or not. 
(find() takes O(1) TC for unordered_map.)
3. If not present, push that element in map and continue.
4. If present, return the elements.
---------------------------------------------------------------------------------*/