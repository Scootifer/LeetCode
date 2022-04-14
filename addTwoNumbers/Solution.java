class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0); //add first number to have initialization and incase of empty list
        
        int i = 0, overflow = 0;
        int cur = 0;
        boolean run = true;
        while(run) {
            cur = overflow;
            
            if(l1 != null) {
                cur += l1.val;
                l1 = l1.next;
                
            }
            
            if(l2 != null) {
                cur += l2.val;
                l2 = l2.next;
                
            }
            
            
            // if-else block used to avoid division by 0
            if(cur >= 10) {
                l.set(i, cur%10);
                overflow = cur/10;
                
            } else {
                l.set(i, cur);
                overflow = 0;
                
            }
            
            
            
            if(l1 == null && l2 == null) {
                run = false; //end loop 
                if(overflow > 0) {
                    l.add(overflow);
                }
            }
                
            else {
                l.add(0); //add next item space since something exists 
                i++;
            }
                
        }
        
        ListNode last = null; 
        
        //traverse the list backwards, using the last node to create each node by the constructor
        for(int z = l.size()-1; z >= 0; z--) {

            ListNode n = new ListNode(l.get(z), last);
            last = n;
            
        }
        
        return last;
    }
}