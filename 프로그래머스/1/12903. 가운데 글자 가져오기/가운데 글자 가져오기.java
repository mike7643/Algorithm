class Solution {
    public String solution(String s) {
        int len = s.length();
        if(len % 2 == 0)
            return s.substring(len/2-1, len/2 +1); //begin 인덱스는 포함, end 인덱스는 미포함
        else
            return s.substring(len/ 2 , len / 2+1);
        
        
    }
}