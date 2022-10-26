class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        int temp;
        String tempStr;
        for(int i=0;i<len;i++)  
        {  
            for(int j=i+1;j<len;j++)  
            {  
                if(heights[j]<heights[i])  
                {  
                    temp = heights[i];
                    tempStr = names[i];
                    heights[i] = heights[j];  
                    names[i] = names[j];
                    heights[j] = temp;  
                    names[j] = tempStr;
                }  
            }  
        }  
        String names2[]= new String[len];
        for(int i=len-1,j=0;i>=0;i--,j++){
            names2[j]=names[i];
        }
        return names2;
    }
}

/*Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.*/
