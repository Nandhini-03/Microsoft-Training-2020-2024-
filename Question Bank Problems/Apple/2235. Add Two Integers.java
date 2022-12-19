class Solution {
    public int sum(int num1, int num2) {
        int num3=0;
        if(num1 < 0 && num2 >= 0)
        {
            num3=num1 + num2;
        }
        else if(num2 < 0 && num1 >= 0)
        {
            num3=num2 + num1;
        }
        else if((num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0))
        {
            num3=num1+num2;
        }
        return num3;
    }
}
