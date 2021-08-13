class Solution {
    public int leastInterval(char[] tasks, int n) {
        
		int[] arr = new int[26];
		for (int task : tasks) {
			arr[task - 'A']++;
		}
		Arrays.parallelSort(arr);

		int fmax = arr[25];
        
		int idle = (fmax-1) * n;
        
		for (int i = arr.length - 2; i >= 0; i--) {
			idle -= Math.min(fmax - 1, arr[i]);
		}
        idle = Math.max(0, idle);
		return idle + tasks.length;
	
    }
}