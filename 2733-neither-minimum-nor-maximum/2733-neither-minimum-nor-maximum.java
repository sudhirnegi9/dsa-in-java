class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
    return -1;
}
        int min = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length ; i++){
            if (nums[i]<min){
                min = nums[i];
            }

            if (nums[i] > max){
                max = nums[i];
            }

        }
         
         for( int sol : nums){
             if( sol != max && sol != min){
                return sol;
             }
             
         }
         return -1;
    }
}