class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++)  {
                if(!map.containsKey(i-j))
                    map.put((i-j), new PriorityQueue<Integer>());
                
                PriorityQueue<Integer> q = map.get(i-j);
                q.add(mat[i][j]);
                
                map.put((i-j), q);
            }
        }
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++)  {
                mat[i][j] = map.get(i-j).poll();
            }
        }
        
        return mat;
    }
}