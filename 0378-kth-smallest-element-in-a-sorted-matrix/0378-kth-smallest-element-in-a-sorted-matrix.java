class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                a.add(matrix[i][j]);
            }
        }
        
     if(a.size()<k)
             return -1;
    Collections.sort(a);
      return a.get(k-1);
    }
}