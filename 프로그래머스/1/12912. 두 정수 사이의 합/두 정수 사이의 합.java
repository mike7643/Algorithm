class Solution {
    public long solution(int a, int b) {
        
        if(a>b){
            int temp = a;
            a = b;
            b= temp;
        }
        
        long res = 0;
        for(int i = a ; i<=b; i++){
            res+=i;
        }
        
        return res;
    }
}