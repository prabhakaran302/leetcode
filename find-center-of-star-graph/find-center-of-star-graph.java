class Solution {
    public int findCenter(int[][] edges) {
        
		int[] inD = new int[edges.length + 1];
		int max = 0;
		int val = -1;
		for (int[] edge : edges) {
			inD[edge[0] - 1]++;
			inD[edge[1] - 1]++;
			if(max < inD[edge[0] - 1])	{
				max = inD[edge[0] - 1];
				val = edge[0];
			}
			
			if(max < inD[edge[1] - 1])	{
				max = inD[edge[1] - 1];
				val = edge[1];
			}
		}
		
		return val;
	
    }
}