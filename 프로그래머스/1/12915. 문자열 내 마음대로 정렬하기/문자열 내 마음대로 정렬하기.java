import java.util.*;

class Solution{
    
    public String[] solution(String[] str, int n) {
        
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.charAt(n)==s2.charAt(n)){
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            }
        });
        return str;
    }               
}