import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chr = s.toCharArray();
        Arrays.sort(chr);
        
        for(int i = chr.length-1 ; i >= 0 ; i--){
            sb.append(chr[i]);
            }
        return sb.toString();
    }
}