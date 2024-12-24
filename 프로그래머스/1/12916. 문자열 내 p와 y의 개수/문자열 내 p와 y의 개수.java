class Solution {
    boolean solution(String s) {
        
        String news = s.toLowerCase();
        int len = news.length();
        int pcnt= 0;
        int ycnt= 0;
        for(int i = 0 ; i<len ; i++){
            if(news.charAt(i)=='p')
                pcnt++;
            if(news.charAt(i)=='y')
                ycnt++;
        }

        if(pcnt == ycnt)
            return true;
        else
            return false;
    }
}