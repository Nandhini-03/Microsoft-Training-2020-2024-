class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0)
        {
            return 0;
        }
        int sign=1;
        int sum=0;
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            else if(s.charAt(i)=='+')
            {
                sign=1;
            }
            else if(s.charAt(i)=='-')
            {
                sign=-1;
            }
            else if(s.charAt(i)=='(')
            {
                stack.push(sum);
                stack.push(sign);
                sum=0;
                sign=1;
            }
            else if(s.charAt(i)==')')
            {
                sum=(stack.pop()*sum) + stack.pop();
            }
            else
            {
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i)))
                {
                    num=(10*num)+Character.getNumericValue(s.charAt(i++));
                }
                sum=sum+(sign*num);
                i-=1;
            }
        }
        return sum;
    }
}
