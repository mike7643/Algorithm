import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int result1;
        int result2;
        
        if(x<y)
            result1=x;
        else
            result1=y;
        
        if((w-x)<(h-y))
            result2=w-x;
        else
            result2=h-y;
        
        if(result1<result2)
            System.out.print(result1);
        else
            System.out.print(result2);
    }
}