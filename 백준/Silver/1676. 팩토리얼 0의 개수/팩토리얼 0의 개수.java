import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        
        while(n>=5){
            res += n/5;
            n/=5;
        }
        
        System.out.println(res);
    }
}