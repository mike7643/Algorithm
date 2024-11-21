import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        
        int max =0;
        int total = a+b+c;
        
        if(max<a)
            max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        
        if(max>=(total-max)){ //삼각형 개조 필요
            int notMax = total-max;
            max = notMax-1;
            System.out.print(notMax+max);
            
        }else
            System.out.print(total);
    }
}