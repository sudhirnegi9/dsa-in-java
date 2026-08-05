import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();
        hm.put('I' , 1);
        hm.put('V', 5 );
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int result=0;
        for(int i=0 ; i<s.length() ;i++){
            int current = hm.get(s.charAt(i));
            if(i < s.length()-1){
                int next = hm.get(s.charAt(i+1));

                if(current < next ){
                    result-=current;
                }
                else{
                    result+=current;
                }
            }
                else{
                    result+=current;
                }
            }
        

        return result;
    }
}