class Solution {
    public int romanToInt(String s) {
        
        int total = 0;
        int len = s.length();
        
        for(int i =0; i<len; i++) {
            
            switch(s.charAt(i)) {
                    
                case 'C' :
                    if(i+1<len) {
                        if(s.charAt(i+1) == 'D') {
                            total += 400;
                            i++;
                            continue;
                        }
                        else if(s.charAt(i+1) == 'M') {
                            total += 900;
                            i++;
                            continue;
                        }
                    }
                    
                    total += 100;
                    break;
                    
                case 'X' :
                    if(i+1<len) {
                        if(s.charAt(i+1) == 'L') {
                            total += 40;
                            i++;
                            continue;
                        }
                        else if(s.charAt(i+1) == 'C') {
                            total += 90;
                            i++;
                            continue;
                        }
                    
                    }
                    
                    total += 10;
                    break;
                
                case 'I' :
                    if(i+1<len) {
                        if(s.charAt(i+1) == 'V') {
                            total += 4;
                            i++;
                            continue;
                        }
                        else if(s.charAt(i+1) == 'X') {
                            total += 9;
                            i++;
                            continue;
                        }
                    
                    }
                    
                    total += 1;
                    break;
                    
                case 'V':
                    total += 5;
                    break;
                    
                case 'L':
                    total += 50;
                    break;
                
                case 'D':
                    total += 500;
                    break;
                    
                case 'M': 
                    total += 1000;
                    break;
                    
            }
            
        }
        
        return total;
    }
    
}