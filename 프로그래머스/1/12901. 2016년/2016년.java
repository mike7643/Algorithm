class Solution {
    public String solution(int a, int b) {
        
        String [] date = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int totalDate = 0;
        
        for(int i =1 ; i<=a ; i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                if(i==a){
                    totalDate += b;
                    break;
                }
                totalDate+=31;
            }
            else if(i==2){
                if(i==a){
                    totalDate += b;
                    break;
                }
                totalDate+=29;
            }
            else{
                if(i==a){
                    totalDate += b;
                    break;
                }
                totalDate+=30;
            }
        }
        return date[totalDate % 7];
    }
}