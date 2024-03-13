class Solution {
    /*  
    * Given a positive integer n, find the pivot integer x such that:
    * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
    * Return the pivot integer x. If no such integer exists, return -1. 
    * It is guaranteed that there will be at most one pivot index for the given input.
    */
    public int pivotInteger(int n) {
        if (n == 1)
            return 1;
        
        int x = n - 1;
        int rsum = n + x;
        int lsum = 1;

        //init left sum
        for (int i = 2; i <= x; i ++){
            lsum += i;
        }

        while(lsum > 0) {
            if (lsum == rsum){
                return x;
            }
            lsum -= x;
            x -= 1;
            rsum += x;
        }
        
        return -1;
        
    }
}
