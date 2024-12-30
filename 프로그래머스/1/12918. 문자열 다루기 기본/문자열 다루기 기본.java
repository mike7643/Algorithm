class Solution {
    public boolean solution(String s) {
        
        int len = s.length();
        
        if(len == 4 || len == 6){
            for(int i = 0 ; i<len ; i++){
                char com = s.charAt(i);
                if(com>= '0' && com <= '9')
                    continue;
                else return false;
            }
            return true;
        }else return false;
    }
}