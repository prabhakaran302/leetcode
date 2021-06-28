/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dim = binaryMatrix.dimensions();
        
        int lowR = 0;
        int highR = dim.get(0);
        
        int lowC = 0;
        int highC = dim.get(1)-1;
        
        boolean found = false;
        while(highC >= 0 && lowR < highR)   {
            if(binaryMatrix.get(lowR, highC) == 1)   {
                found = true;
                highC--;
            } else  {
                lowR++;
            }
        }
        
        if(found)
            return highC+1;
        
        return -1;
        
    }
}