import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int SOL = 0 ;
        for(int num : nums){
            
            if(hs.contains(num)){
                SOL = num;
                break;
            }
            hs.add(num);
        }
        return SOL;
    }
}