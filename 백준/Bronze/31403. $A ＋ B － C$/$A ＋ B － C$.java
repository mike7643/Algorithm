import java.util.Scanner;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String d,e,f;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        d= String.valueOf(a)+String.valueOf(b);
        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(d)-c);
    }
}

