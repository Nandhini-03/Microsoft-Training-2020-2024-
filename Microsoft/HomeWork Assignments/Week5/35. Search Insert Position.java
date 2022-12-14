class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
        int mid=(left+right)/2;
        if(target<nums[mid]){
            right=mid-1;
        }
            else if(target>nums[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        } 
        return (nums[left]<target)?left+1:left;
        
    }
}

/*Input: nums = [1,3,5,6], target = 5
Output: 2 */
