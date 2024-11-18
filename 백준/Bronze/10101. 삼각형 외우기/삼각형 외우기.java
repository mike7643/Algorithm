import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        if(a+b+c==180){
            if(a!=b && b!=c && a!=c)
                System.out.print("Scalene");
            else if(a ==b && b==c && a ==c)
                System.out.print("Equilateral");
            else
                System.out.print("Isosceles");
        }else System.out.print("Error");
    }
}