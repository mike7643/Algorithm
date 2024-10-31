import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        int same = 0;
        int max = 0;
        
        
        if(a==b&&b==c&&a==c)
            same=10000+a*1000;
        else if(a==b||b==c||a==c){
            if(a==b)
                same=1000+a*100;
            if(c==b)
                same=1000+c*100;
            if(a==c)
                same=1000+a*100;
        }else{
            if(max<a)
                max=a;
            if(max<b)
                max=b;
            if(max<c)
                max=c;
            same=max*100;
        }
        System.out.println(same);
    }
}