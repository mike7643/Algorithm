class Solution {
    public String solution(String s, int n) {
        
        char[] chr = s.toCharArray();
        
        for(int i = 0 ; i<chr.length ; i++){
            chr[i]=oneChanger(chr[i],n);
        }
        return new String(chr);
    }
    
    public char oneChanger(char c, int n){
        
        for(int i = 0 ; i < n ; i++){
            
            if(c-65>=0 && c-65<=25){
                if(c==90){
                    c='A';
                    continue;
                }
                c++;
             
            }else if(c-97>=0 && c-97<=25){
                if(c==122){
                    c='a';
                    continue;
                }
                c++;
            }else
                break;
        }
        
        return c;
    }
}