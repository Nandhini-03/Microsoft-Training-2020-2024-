class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            return edges[0][0];
        return edges[0][1];
    }
}

/*Input: edges = [[1,2],[2,3],[4,2]]
Output: 2  */
