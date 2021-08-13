class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
		Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
		System.out.println(Arrays.deepToString(boxTypes));

		int unit = 0;
		for (int[] boxType : boxTypes) {
			if (truckSize < 0)
				break;
			int curVal = Math.min(truckSize, boxType[0]);
			unit += curVal * boxType[1];

			truckSize -= boxType[0];
		}

		return unit;
	
    }
}