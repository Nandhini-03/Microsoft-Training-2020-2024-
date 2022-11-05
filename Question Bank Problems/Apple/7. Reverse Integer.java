class Solution {
    public int reverse(int x) {
        int sign=x>0 ? 1 : -1;
        x=Math.abs(x);
        int num,ans=0;
        while(x>0)
        {
            num=x%10;
            if(ans>(Integer.MAX_VALUE - num)/10)
            {
                return 0;
            }
            ans=(ans*10)+num;
            x=x/10;
            reverse(x);
        }
        return ans*sign;
    }
}


/*Input: x = 123
Output: 321 */
