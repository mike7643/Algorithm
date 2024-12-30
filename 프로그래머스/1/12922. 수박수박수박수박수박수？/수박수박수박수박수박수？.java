class Solution {
    public String solution(int n) {
        String res="";
        if(n % 2 ==1 ){
            for(int i  = 1 ; i<=((n-1) / 2) ;i++)
                res+="수박";
            
            res+="수";
        }else
            for(int i = 1 ; i<=n /2 ; i++)
                res+="수박";
        
        return res;
    
    }
}