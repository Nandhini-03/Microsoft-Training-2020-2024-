class Solution {
    public int fib(int N) {
        if(N<=1)
            return N;
        else
            return fib(N-1)+fib(N-2);
    }
}

/* Input: n = 2
Output: 1 */
