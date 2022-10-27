class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int flag=0;
        for(int i:nums)
        {
            if(i==0)
            {
                flag++;
                continue;
            }
        total*=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(flag==0)
            {
                nums[i]=total/nums[i];
            }
            else if(flag==1)
            {
                nums[i]=nums[i]!=0 ? 0 : total;
            }
            else
            {
                nums[i]=0;
            }
        }
        return nums;
    }
}

/*Input: nums = [1,2,3,4]
Output: [24,12,8,6]*/
