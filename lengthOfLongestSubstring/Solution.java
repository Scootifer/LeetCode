import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<Character>();
        int best = 0, cur = 0;
        int len = s.length();
        
        
        for(int i = 0; i<len; i++) {
            set.add(s.charAt(i));
            cur++;
            
            if(cur > best) {
                best = cur;
            } 
            
            for(int z = i+1; z<len; z++) {
                if(set.contains(s.charAt(z))) {
                    z = len; //stop loop
                } else {
                    set.add(s.charAt(z));
                    cur++; 
                }
                
                if(cur > best) {
                    best = cur;
                } 
            }
            
            set.clear();
            cur = 0;
            
        }
        
        return best;
        
    }
}