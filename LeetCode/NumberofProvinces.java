class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean [] visit = new boolean[n];
        int counter=0;

        for(int i = 0 ; i<n ; i++){
            if(!visit[i]){
                counter ++;
                dfs(isConnected,visit,i);
            }
        }
        return counter;
        
    }
    public void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visited[i]) {
                dfs(isConnected, visited, i);
            }
        }
    }
}
//Graph Question : leetcode 547
