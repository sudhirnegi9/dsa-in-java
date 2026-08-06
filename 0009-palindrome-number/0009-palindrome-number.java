class Solution {
    public boolean isPalindrome(int x) {
       String orignal = String.valueOf(x);
       StringBuilder rev = new StringBuilder(orignal); 
            rev.reverse();
            
            return orignal.equals(rev.toString());


        }
    }
