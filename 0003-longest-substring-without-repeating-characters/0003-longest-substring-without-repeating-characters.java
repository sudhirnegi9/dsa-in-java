class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longestSubstring=0;
        int[] freqarr = new int[128];
        while(right<s.length()){
            char curr = s.charAt(right);
            freqarr[curr]++;

            while(freqarr[curr]>=2){
                char leftcurr = s.charAt(left);
                freqarr[leftcurr]--;
                left++;

            }
            int currlongSubString = right - left +1;
            longestSubstring  = Math.max(longestSubstring , currlongSubString);
            right++;
        }
        return longestSubstring;
    }
}