import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rep =sc.nextInt();
        int result=0;
        
        for(int i=1;i<=rep;i++){
            result+=i;
        }
        System.out.println(result);
    }
}