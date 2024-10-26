import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int cnt=1;
        int srt=1;
        int end=1;
        int sum=1;
        
        
        while(end != n){
            if(sum < n){
                end++;
                sum+=end;
            }else if(sum>n){
                sum-=srt;
                srt++;
            }else{
                cnt++;
                end++;
                sum+=end;
            }
        }
        System.out.println(cnt);
    }
}