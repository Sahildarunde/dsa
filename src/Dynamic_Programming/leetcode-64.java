class Solution {
    public int uniquePathsWithObstacles(int[][] maze) {
       
        int n = maze.length;
        int m = maze[0].length;

        int prev[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int temp[] = new int[m];
            
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == 1) {
                    temp[j] = 0; 
                    continue;
                }
                if (i == 0 && j == 0) {
                    temp[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;
                if (i > 0)
                    up = prev[j];
                
              
                if (j > 0)
                    left = temp[j - 1];

                temp[j] = up + left;
            }
            
            prev = temp;
        }

        return prev[n - 1];
    }
}