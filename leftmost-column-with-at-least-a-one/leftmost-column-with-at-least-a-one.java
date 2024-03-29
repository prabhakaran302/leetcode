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
        
        int row = 0;
        int col = dim.get(1) - 1;
        
        int prev = col;
        
        while(row < dim.get(0) && col >= 0) {
            if(binaryMatrix.get(row,col) == 0)  {
                row++;
            } else if(binaryMatrix.get(row,col) == 1)  {
                col--;
            }
        }
        
        return col == dim.get(1) - 1 ? -1 : col + 1; 
    }
}