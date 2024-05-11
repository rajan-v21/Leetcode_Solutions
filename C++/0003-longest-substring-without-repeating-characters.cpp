#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        if(n <= 1) return n;
        int left = 0, right = 0;
        int maxLength = 0;
        unordered_map<char, int> ump;
        while(right < n){
            if(ump.find(s[right]) == ump.end())
                ump.insert({s[right], right});
            else{
                left = max(left, ump[s[right]]+1);
                ump[s[right]] = right;
            }
            maxLength = max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
};

int main()
{
    Solution s;
    cout <<s.lengthOfLongestSubstring("pwwkew");
}

/*-----------------------------------------------------------------------------------------
TC: O(n) SC: O(n)

Intuition:

1. Simply traverse from left to right and insert each char in unordered_map until duplicate char is found.
(we will not use queue as find() takes TC O(n) whereas in unordered_map it takes TC O(1))
2. If we encounter duplicate char, we will increment left by taking max(left, ump[s[right]]+1) because
3. Case 1: If duplicate char found is at left index, it will increment left by +1.
Case 2: If duplicate char found is after left index, it will set left to +1 index where right char's duplicate is present.
4. And calculate length of non-repeating string at each step (for each loop).
-----------------------------------------------------------------------------------------*/