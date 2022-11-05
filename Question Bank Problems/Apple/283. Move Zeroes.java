class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1)
        {
            return;
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        while(count<nums.length)
        {
            nums[count]=0;
            count++;
        }
        //return nums;
    }
}

/*Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */
