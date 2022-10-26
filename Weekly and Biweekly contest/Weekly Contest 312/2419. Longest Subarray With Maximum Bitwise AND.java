class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen=0,maxVal=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>maxVal)
            {
                maxVal=nums[i];
            }
        }
        int curr=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==maxVal)
            {
                curr++;
            }
            else
            {
                maxLen=Math.max(maxLen,curr);
                curr=0;
            }
        }
        maxLen=Math.max(maxLen,curr);
        return maxLen;
    }
}

/*Input: nums = [1,2,3,3,2,2]
Output: 2
Explanation:
The maximum possible bitwise AND of a subarray is 3.
The longest subarray with that value is [3,3], so we return 2. */
