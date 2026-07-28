class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> hs= new HashSet<Integer>();
        for(int num : nums){
            hs.add(num);
        }
         int longestSequence = 0;
        for(int num : hs){
           
            if(!hs.contains(num-1)){
                int NewNumber = num;

                while(hs.contains(NewNumber)){
                    NewNumber++;
                }
                if(longestSequence < (NewNumber - num)){
                    longestSequence = (NewNumber - num );
                }
            }
        }
        return longestSequence;
    }
}