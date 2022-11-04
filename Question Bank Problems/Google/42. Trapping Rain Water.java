class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int answer=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                left[i]=height[i];
            }
            else
            {
                left[i]=Math.max(left[i-1],height[i]);
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                right[i]=height[i];
            }
            else
            {
                right[i]=Math.max(right[i+1],height[i]);
            }
        }
       // System.out.print(Arrays.toString(right));
        for(int i=0;i<n;i++)
        {
            answer+=(Math.min(left[i],right[i]))-height[i];
        }
        return answer;
    }
}


/*Input: height = [4,2,0,3,2,5]
Output: 9  */
