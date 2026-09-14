class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor^=i;
        }

        for(int j=0 ; j<=nums.length ; j++){
            xor^=j;
        }
        return xor;
    }
}